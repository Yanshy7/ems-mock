package com.gsta.ems.mock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmsMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsMockApplication.class, args);
		log.info("ems-mock 启动成功...");
	}

}
