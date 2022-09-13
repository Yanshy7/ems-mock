package com.gsta.ems.mock.service.ts.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.gsta.ems.mock.dao.ts.EDataMapper;
import com.gsta.ems.mock.entity.ts.PropertiesEModbus;
import com.gsta.ems.mock.service.ts.EDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("jetlinks-ts")
public class EDataServiceImpl implements EDataService {

    @Autowired
    private EDataMapper eDataMapper;

    @Override
    public PropertiesEModbus queryLastRecord(String tableName) {
        return eDataMapper.queryLastRecord(tableName);
    }

    @Override
    public void saveMockEData(String tableName, PropertiesEModbus e) {
        eDataMapper.saveMockEData(tableName,e);
    }

}
