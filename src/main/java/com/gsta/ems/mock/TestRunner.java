package com.gsta.ems.mock;

import com.gsta.ems.mock.generator.EDataGenerator;
import com.gsta.ems.mock.generator.GDataGenerator;
import com.gsta.ems.mock.generator.WDataGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * spring boot 启动后执行，用于测试生成器的功能
 *
 * @author neo
 * @since 1.0
 */
@Slf4j
@Getter
@Setter
@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private EDataGenerator eDataGenerator;
    @Autowired
    private WDataGenerator wDataGenerator;
    @Autowired
    private GDataGenerator gDataGenerator;

    @Override
    public void run(String... args) throws Exception {
        // log.info("测试生成电表时序数据");
        // eDataGenerator.generate();
        // wDataGenerator.generate();
        // gDataGenerator.generate();
    }

}
