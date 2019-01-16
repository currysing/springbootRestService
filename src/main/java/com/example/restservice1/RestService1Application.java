package com.example.restservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.restservice1.repository")
@EntityScan(basePackages="com.example.restservice1.entity")
public class RestService1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestService1Application.class, args);
	}

}

