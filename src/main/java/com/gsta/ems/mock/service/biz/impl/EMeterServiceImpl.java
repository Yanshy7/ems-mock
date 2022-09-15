package com.gsta.ems.mock.service.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gsta.ems.mock.dao.biz.EMeterMapper;
import com.gsta.ems.mock.entity.biz.EMeterEntity;
import com.gsta.ems.mock.service.biz.EMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("ems-biz")
public class EMeterServiceImpl extends ServiceImpl<EMeterMapper, EMeterEntity> implements EMeterService {

    @Autowired
    private EMeterMapper eMeterMapper;

    @Override
    public List<EMeterEntity> queryList() {
        return eMeterMapper.queryList();
    }

}
