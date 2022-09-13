package com.gsta.ems.mock.service.biz;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gsta.ems.mock.entity.biz.GMeterEntity;

import java.util.List;

public interface GMeterService extends IService<GMeterEntity> {

    public List<GMeterEntity> queryList();

}
