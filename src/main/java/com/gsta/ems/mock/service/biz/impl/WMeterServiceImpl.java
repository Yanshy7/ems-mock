package com.gsta.ems.mock.service.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gsta.ems.mock.dao.biz.EMeterMapper;
import com.gsta.ems.mock.dao.biz.WMeterMapper;
import com.gsta.ems.mock.entity.biz.EMeterEntity;
import com.gsta.ems.mock.entity.biz.WMeterEntity;
import com.gsta.ems.mock.service.biz.EMeterService;
import com.gsta.ems.mock.service.biz.WMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("ems-biz")
public class WMeterServiceImpl extends ServiceImpl<WMeterMapper, WMeterEntity> implements WMeterService {

    @Autowired
    private WMeterMapper wMeterMapper;

    @Override
    public List<WMeterEntity> queryList() {
        return null;
    }
}
