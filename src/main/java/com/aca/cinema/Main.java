package com.aca.cinema;

import com.aca.cinema.service.CinemaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        CinemaService cinemaService = context.getBean(CinemaService.class);
        System.out.println(cinemaService.getCinemaList());
    }

}
