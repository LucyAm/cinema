package com.aca.cinema;

import com.aca.cinema.service.CinemaService;
import com.aca.cinema.service.MovieService;
import com.aca.cinema.service.MovieSessionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
//      CinemaService cinemaService = context.getBean(CinemaService.class);
//      System.out.println(cinemaService.getCinemaList());
//
        MovieService movieService=context.getBean(MovieService.class);
        System.out.println(movieService.getMovieInfo(11L));

        MovieSessionService movieSessionService = context.getBean(MovieSessionService.class);
//      System.out.println(movieSessionService.getCinemaSessions(2L));
//      System.out.println(movieSessionService.getMovieSessions(2L));



    }

}
