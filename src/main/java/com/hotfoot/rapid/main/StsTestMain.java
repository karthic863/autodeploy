package com.hotfoot.rapid.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = { "com.hotfoot" },exclude = {DataSourceAutoConfiguration.class })
@EntityScan(basePackages = { "com.hotfoot" })
@ComponentScan(basePackages = { "com.hotfoot" })
@EnableAsync
public class StsTestMain {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	public static void main(String[] args) {
		SpringApplication.run(StsTestMain.class, args);
	}
}

