package com.aca.cinema.controller;

import com.aca.cinema.domain.CinemaSession;
import com.aca.cinema.domain.MovieSession;
import com.aca.cinema.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @RequestMapping("/cinema-session")
    public List<CinemaSession> getCinemaSessions(@RequestParam(value="sessions.cinema_id") Long cinemaId){
        return sessionService.getCinemaSessions(cinemaId);
    }

    @RequestMapping("/movie-session")
    public List<MovieSession> getMovieSessions(@RequestParam(value="sessions.movie_id") Long movieId){
        return sessionService.getMovieSessions(movieId);
    }
}
