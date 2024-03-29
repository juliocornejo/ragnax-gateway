package com.ragnax.ragnaxgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@SpringBootApplication
public class RagnaxGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagnaxGatewayApplication.class, args);
	}

}
