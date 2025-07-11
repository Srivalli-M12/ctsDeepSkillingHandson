package com.cognizant.spring_jwt_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringJwtAuthApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtAuthApplication.class);

	public static void main(String[] args) {
		
		LOGGER.info("START");
		SpringApplication.run(SpringJwtAuthApplication.class, args);
		
        LOGGER.info("END");
	}

}

