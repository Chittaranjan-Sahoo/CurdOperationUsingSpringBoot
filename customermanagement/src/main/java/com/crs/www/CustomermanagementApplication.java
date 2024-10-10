package com.crs.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CustomermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementApplication.class, args);
	}

}
