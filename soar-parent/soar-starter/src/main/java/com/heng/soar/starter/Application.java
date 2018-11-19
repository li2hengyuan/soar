package com.heng.soar.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.heng.soar"})
@MapperScan(basePackages = "com.heng.soar.*.mapper")
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}