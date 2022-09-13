package com.gsta.ems.mock.dao.biz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gsta.ems.mock.entity.biz.EMeterEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EMeterMapper extends BaseMapper<EMeterEntity> {

    /**
     * 查找需要生成模拟数据的电表列表
     *
     * @Param
     * @return
     */
    public List<EMeterEntity> queryList();

}
