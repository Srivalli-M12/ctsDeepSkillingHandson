package com.cognizant.spring_core_learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        System.out.println("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        for (Country country : countryList) {
            System.out.println(country);
        }
        
        System.out.println("END");
    }
}