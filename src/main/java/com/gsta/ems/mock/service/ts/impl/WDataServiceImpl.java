package com.gsta.ems.mock.service.ts.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.gsta.ems.mock.dao.ts.WDataMapper;
import com.gsta.ems.mock.entity.ts.PropertiesWModbus;
import com.gsta.ems.mock.service.ts.WDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("jetlinks-ts")
public class WDataServiceImpl implements WDataService {

    @Autowired
    private WDataMapper wDataMapper;

    @Override
    public PropertiesWModbus queryLastRecord(String tableName) {
        return wDataMapper.queryLastRecord(tableName);
    }

    @Override
    public void saveMockWData(String tableName, PropertiesWModbus e) {
        wDataMapper.saveMockWData(tableName,e);
    }

}
