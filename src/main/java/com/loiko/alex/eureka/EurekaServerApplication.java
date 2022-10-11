package com.loiko.alex.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	//TODO FIX observing founded microservices after GET http://localhost:8070/eureka/apps/{appId} request
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}