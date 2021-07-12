package com.example.SpringwebProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = SpringwebProjectApplication.class)
@SpringBootApplication
public class SpringwebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebProjectApplication.class, args);
	}

}
