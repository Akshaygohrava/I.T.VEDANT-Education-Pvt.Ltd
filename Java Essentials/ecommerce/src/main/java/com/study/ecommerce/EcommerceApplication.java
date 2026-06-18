package com.study.ecommerce;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		
		System.out.println("SpringBoot Project Run SuccessFully !");
		System.out.println(" SuccessFully Connected To MySQL!");
		
		// REST API , GEt , POST , PUT, DELETE 
		// GET : get all products : localhost:8080/products , get specific product using id  : localhost:8080/products{1}
		// POST : localhost:8080/products
		
		
		// Entites
		// Repository
		// Services service layers
		// Controller
		// Response ..
		
		// Entity To DTO , to convert ModelMapper is used 
		// 
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
