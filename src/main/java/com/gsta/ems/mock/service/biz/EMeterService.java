package com.gsta.ems.mock.service.biz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsta.ems.mock.entity.biz.EMeterEntity;

import java.util.List;

public interface EMeterService extends IService<EMeterEntity> {

    public List<EMeterEntity> queryList();

}
