package com.cognizant.spring_learn_web.controller;


import com.cognizant.spring_learn_web.model.Country;
import com.cognizant.spring_learn_web.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("in");
        context.close();

        LOGGER.info("END - getCountryIndia()");
        return country;
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry() with code = {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry()");
        return country;
    }
}
