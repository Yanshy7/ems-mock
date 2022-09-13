package com.gsta.ems.mock.generator;

import com.gsta.ems.mock.entity.biz.GMeterEntity;
import com.gsta.ems.mock.entity.ts.PropertiesGModbus;
import com.gsta.ems.mock.service.biz.GMeterService;
import com.gsta.ems.mock.service.ts.GDataService;
import com.gsta.ems.mock.service.ts.TableService;
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
public class GDataGenerator implements DataGenerator {

    @Autowired
    private GMeterService gMeterService;

    @Autowired
    private GDataService gDataService;

    @Autowired
    private TableService tableService;

    private static final String G_TABLE_NAME_TEMPLATE = "properties_g_modbus_%s";

    private static final String G_STABLE_NAME = "properties_g_modbus";

    @Override
    public void generate() {
        log.info("模拟生成气表数据");
        // 1. 查询电表数据
        List<GMeterEntity> gMeters = gMeterService.queryList();

//        List<GMeterEntity> gMeters = new ArrayList<>();
//        if(CollUtil.isNotEmpty(list)){
//            gMeters.add(list.get(0));
//        }

        // 2. 遍历每个电表
        for (GMeterEntity e : gMeters){

            // 2.1 在 jetlinks 上新建 properties_e_modbus 超级表的子表
            String meterNum = e.getMeterNum();
            String tableName = String.format(G_TABLE_NAME_TEMPLATE,meterNum);
            log.info("创建表（没有才创建）：{}",tableName);
            tableService.createTable(tableName,G_STABLE_NAME,meterNum);

            // 2.2 查询子表最后一条数据，生成下一条数据
            PropertiesGModbus last = gDataService.queryLastRecord(tableName);
            PropertiesGModbus edata;
            if (last==null){
                edata = PropertiesGModbus.mock();
            }else{
                edata = last.next();
            }

            // 2.3 插入模拟数据
            gDataService.saveMockGData(tableName,edata);
        }
    }


}
