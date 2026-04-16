package com.example.EurekaServerex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerexApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerexApplication.class, args);
	}

}
