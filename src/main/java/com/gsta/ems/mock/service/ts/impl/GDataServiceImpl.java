package com.gsta.ems.mock.service.ts.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.gsta.ems.mock.dao.ts.GDataMapper;
import com.gsta.ems.mock.entity.ts.PropertiesGModbus;
import com.gsta.ems.mock.service.ts.GDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("jetlinks-ts")
public class GDataServiceImpl implements GDataService {

    @Autowired
    private GDataMapper gDataMapper;

    @Override
    public PropertiesGModbus queryLastRecord(String tableName) {
        return gDataMapper.queryLastRecord(tableName);
    }

    @Override
    public void saveMockGData(String tableName, PropertiesGModbus e) {
        gDataMapper.saveMockGData(tableName,e);
    }

}
