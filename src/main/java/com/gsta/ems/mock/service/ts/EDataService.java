package com.gsta.ems.mock.service.ts;

import com.gsta.ems.mock.entity.ts.PropertiesEModbus;

public interface EDataService {

    PropertiesEModbus queryLastRecord(String tableName);

    void saveMockEData(String tableName, PropertiesEModbus e);
}
