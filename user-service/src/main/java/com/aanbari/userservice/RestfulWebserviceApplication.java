package com.aanbari.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestfulWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebserviceApplication.class, args);
	}

}
