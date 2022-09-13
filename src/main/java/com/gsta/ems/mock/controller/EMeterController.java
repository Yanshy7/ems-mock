package com.gsta.ems.mock.controller;


import com.gsta.ems.mock.entity.biz.EMeterEntity;
import com.gsta.ems.mock.service.biz.EMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/e-meter")
public class EMeterController {

    @Autowired
    private EMeterService eMeterService;

    @GetMapping("/list")
    public List<EMeterEntity> list(){
        List<EMeterEntity> list = eMeterService.list();
        return list;
    }

}
