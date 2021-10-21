package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example")

@SpringBootApplication(scanBasePackages="com.example")

public class DbExperimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbExperimentApplication.class, args);
	}

}
