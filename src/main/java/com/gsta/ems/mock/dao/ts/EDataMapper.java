package com.gsta.ems.mock.dao.ts;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.gsta.ems.mock.entity.ts.PropertiesEModbus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
@InterceptorIgnore(tenantLine = "true",
        dynamicTableName = "true",
        blockAttack = "true",
        illegalSql = "true",
        dataPermission = "true",
        sharding = "true"
)
@DS("jetlinks-ts")
public interface EDataMapper {

    /**
     * 查找最后一条有效记录
     *
     * @param tableName
     * @return
     */
    PropertiesEModbus queryLastRecord(@Param("tableName") String tableName);

    /**
     * 保存一条时序数据
     *
     * @param tableName
     * @param e
     */
    void saveMockEData(@Param("tableName") String tableName,
                       @Param("e") PropertiesEModbus e);


}
