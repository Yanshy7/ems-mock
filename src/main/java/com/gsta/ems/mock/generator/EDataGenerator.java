package com.gsta.ems.mock.generator;

import com.gsta.ems.mock.entity.biz.EMeterEntity;
import com.gsta.ems.mock.entity.ts.PropertiesEModbus;
import com.gsta.ems.mock.service.biz.EMeterService;
import com.gsta.ems.mock.service.ts.EDataService;
import com.gsta.ems.mock.service.ts.TableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author neo
 * @since 1.0
 */
@Slf4j
@Component("eDataGenerator")
public class EDataGenerator implements DataGenerator {

    @Autowired
    private EMeterService eMeterService;

    @Autowired
    private EDataService eDataService;

    @Autowired
    private TableService tableService;

    private static final String E_STABLE_NAME = "properties_e_modbus";

    private static final String E_TABLE_NAME_TEMPLATE = "properties_e_modbus_%s";

    @Override
    public void generate() {
        log.info("模拟生成电表数据");
        // 1. 查询电表数据
        List<EMeterEntity> eMeters  = eMeterService.queryList();
        System.out.println("eMeters的大小为：" + eMeters.size());
//        List<EMeterEntity> eMeters = new ArrayList<>();
//        if(CollUtil.isNotEmpty(list)){
//            eMeters.add(list.get(0));
//        }
        // 2. 遍历每个电表
        for (EMeterEntity e : eMeters){
            // 2.1 在 jetlinks 上新建 properties_e_modbus 超级表的子表
            String meterNum = e.getMeterNum();
            String tableName = String.format(E_TABLE_NAME_TEMPLATE,meterNum);
            System.out.println(meterNum);
            log.info("创建表（没有才创建）：{}",tableName);
            tableService.createTable(tableName,E_STABLE_NAME,meterNum);
            // 2.2 查询子表最后一条数据，生成下一条数据
            PropertiesEModbus last = eDataService.queryLastRecord(tableName);
            PropertiesEModbus edata;
            if (last==null){
                edata = PropertiesEModbus.mock();
            }else{
                edata = last.next();
            }
            // 2.3 插入模拟数据
            eDataService.saveMockEData(tableName,edata);
        }
    }

}
