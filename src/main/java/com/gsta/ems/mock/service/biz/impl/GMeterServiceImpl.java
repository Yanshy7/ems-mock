package com.gsta.ems.mock.service.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gsta.ems.mock.dao.biz.GMeterMapper;
import com.gsta.ems.mock.entity.biz.GMeterEntity;
import com.gsta.ems.mock.service.biz.GMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("ems-biz")
public class GMeterServiceImpl extends ServiceImpl<GMeterMapper, GMeterEntity> implements GMeterService {

    @Autowired
    private GMeterMapper gMeterMapper;

    @Override
    public List<GMeterEntity> queryList() {
        return gMeterMapper.queryList();
    }
}
