package com.gsta.ems.mock.service.biz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsta.ems.mock.entity.biz.WMeterEntity;

import java.util.List;


public interface WMeterService extends IService<WMeterEntity> {

    public List<WMeterEntity> queryList();

}
