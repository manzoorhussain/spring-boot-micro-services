package com.order.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class OrderServiceApplication{


	 public static void main(String[] args) {


		SpringApplication.run(OrderServiceApplication.class, args);
	}


}
