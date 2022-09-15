package com.gsta.ems.mock.config;

import com.gsta.ems.mock.generator.EDataGenerator;
import com.gsta.ems.mock.generator.GDataGenerator;
import com.gsta.ems.mock.generator.WDataGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Getter
@Setter
@Slf4j
@Configuration
@EnableAsync
@EnableScheduling
public class ScheduleConfig {

    @Autowired
    private EDataGenerator eDataGenerator;
    @Autowired
    private WDataGenerator wDataGenerator;
    @Autowired
    private GDataGenerator gDataGenerator;


    @Scheduled(initialDelay = 10000, fixedRate = 60000) // TODO: 测试没问题可以改成 60 * 1000
    public void mockEMeterData() {
        eDataGenerator.generate();
    }

//    @Scheduled(initialDelay = 20000,fixedRate = 60000)
//    public void mockWMeterData() {
//        wDataGenerator.generate();
//    }

//    @Scheduled(initialDelay = 30000,fixedRate = 60000)
//    public void mockGMeterData() {
//        gDataGenerator.generate();
//    }

}
