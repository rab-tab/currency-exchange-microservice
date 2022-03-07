package com.myapp.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication8000 {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication8000.class, args);
	}

}
