package com.capg.dac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DealsAndCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealsAndCouponsApplication.class, args);
	}

}
