package com.gsta.ems.mock.dao.ts;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.gsta.ems.mock.entity.ts.ShowSTableEntity;
import com.gsta.ems.mock.entity.ts.ShowTableEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问接口：电表 15 分钟数据
 *
 * @author neo
 * @since 1.0
 */
@Mapper
@InterceptorIgnore(tenantLine = "true")
@DS("jetlinks-ts")
public interface TableMapper {

	/**
	 * 模糊查找超级表
	 * @param sTableName
	 * @return
	 */
    List<ShowSTableEntity> showSTablesLike(@Param("sTableName") String sTableName);

	/**
	 * 模糊查找子表
	 * @param tableName
	 * @return
	 */
    List<ShowTableEntity> showTablesLike(@Param("tableName") String tableName);

	/**
	 * 根据超级表创建子表，创建时需要执行标签 deviceid
	 * @param tableName，子表，如：properties_e_modbus_aaa
	 * @param sTableName，超级表，如：properties_e_modbus
	 * @param deviceid，设备号，如：aaa
	 */
    void createTable(@Param("tableName") String tableName,
                     @Param("sTableName") String sTableName,
                     @Param("deviceid") String deviceid);
}


