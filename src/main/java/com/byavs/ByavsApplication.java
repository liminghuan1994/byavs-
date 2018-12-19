package com.byavs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.byavs.mapper")
public class ByavsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByavsApplication.class, args);
	}
}
