package com.cognizant.orm_learn;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
@ComponentScan(basePackages = "com.cognizant.ormlearn")
@EnableJpaRepositories(basePackages = "com.cognizant.ormlearn.repository")
@EntityScan(basePackages = "com.cognizant.ormlearn.model")
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
	}

	private static void testGetAllCountries() {
	    LOGGER.info("Start");

	    List<Country> countries = countryService.getAllCountries();
	    for (Country c : countries) {
	        System.out.println("Country Code: " + c.getCode() + ", Name: " + c.getName());
	    }

	    LOGGER.info("End");
	}
}