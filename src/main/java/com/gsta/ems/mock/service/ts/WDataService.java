package com.gsta.ems.mock.service.ts;

import com.gsta.ems.mock.entity.ts.PropertiesWModbus;

public interface WDataService {
    PropertiesWModbus queryLastRecord(String tableName);

    void saveMockWData(String tableName, PropertiesWModbus e);
}
