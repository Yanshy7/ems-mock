package com.gsta.ems.mock.controller;


import com.gsta.ems.mock.entity.biz.GMeterEntity;
import com.gsta.ems.mock.service.biz.GMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/g-meter")
public class GMeterController {

    @Autowired
    private GMeterService gMeterService;

    @GetMapping("/list")
    public List<GMeterEntity> list(){
        List<GMeterEntity> list = gMeterService.list();
        return list;
    }

}
