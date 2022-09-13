package com.gsta.ems.mock.controller;


import com.gsta.ems.mock.entity.biz.WMeterEntity;
import com.gsta.ems.mock.service.biz.WMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/w-meter")
public class WMeterController {

    @Autowired
    private WMeterService wMeterService;

    @GetMapping("/list")
    public List<WMeterEntity> list(){
        List<WMeterEntity> list = wMeterService.list();
        return list;
    }

}
