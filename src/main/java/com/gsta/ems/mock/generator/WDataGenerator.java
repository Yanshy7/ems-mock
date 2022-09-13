package com.gsta.ems.mock.generator;

import com.gsta.ems.mock.entity.biz.WMeterEntity;
import com.gsta.ems.mock.entity.ts.PropertiesWModbus;
import com.gsta.ems.mock.service.biz.WMeterService;
import com.gsta.ems.mock.service.ts.TableService;
import com.gsta.ems.mock.service.ts.WDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <h1>xxx</h1>
 *
 * @author neo
 * @jetlinks x
 * @since 1.0
 */
@Slf4j
@Component
public class WDataGenerator implements DataGenerator {

    @Autowired
    private WMeterService wMeterService;

    @Autowired
    private WDataService wDataService;

    @Autowired
    private TableService tableService;

    private static final String W_TABLE_NAME_TEMPLATE = "properties_w_modbus_%s";

    private static final String W_STABLE_NAME = "properties_w_modbus";


    @Override
    public void generate() {
        log.info("模拟生成电表数据");
        // 1. 查询电表数据
        List<WMeterEntity> wMeters = wMeterService.queryList();

//        List<WMeterEntity> wMeters = new ArrayList<>();
//        if(CollUtil.isNotEmpty(list)){
//            wMeters.add(list.get(0));
//        }

        // 2. 遍历每个电表
        for (WMeterEntity e : wMeters){

            // 2.1 在 jetlinks 上新建 properties_e_modbus 超级表的子表
            String meterNum = e.getMeterNum();
            String tableName = String.format(W_TABLE_NAME_TEMPLATE,meterNum);
            log.info("创建表（没有才创建）：{}",tableName);
            tableService.createTable(tableName,W_STABLE_NAME,meterNum);

            // 2.2 查询子表最后一条数据，生成下一条数据
            PropertiesWModbus last = wDataService.queryLastRecord(tableName);
            PropertiesWModbus edata;
            if (last==null){
                edata = PropertiesWModbus.mock();
            }else{
                edata = last.next();
            }

            // 2.3 插入模拟数据
            wDataService.saveMockWData(tableName,edata);
        }
    }


}
