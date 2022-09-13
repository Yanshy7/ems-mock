package com.gsta.ems.mock.service.ts.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.gsta.ems.mock.dao.ts.TableMapper;
import com.gsta.ems.mock.service.ts.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("jetlinks-ts")
public class TableServiceImpl implements TableService {

    @Autowired
    private TableMapper tableMapper;

    @Override
    public void createTable(String tableName,String sTableName,String deviceid){
        tableMapper.createTable(tableName,sTableName,deviceid);
    }

}
