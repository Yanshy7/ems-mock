package com.gsta.ems.mock.service.ts;

import com.gsta.ems.mock.entity.ts.PropertiesGModbus;

public interface GDataService {
    PropertiesGModbus queryLastRecord(String tableName);

    void saveMockGData(String tableName, PropertiesGModbus e);

}
