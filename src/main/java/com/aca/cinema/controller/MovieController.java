package com.aca.cinema.controller;

import com.aca.cinema.domain.MovieHeader;
import com.aca.cinema.domain.MovieInfo;
import com.aca.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @RequestMapping("/movies")
    public List<MovieHeader> getMovieList() {
        return movieService.getMovieList();
    }

    @RequestMapping("/movie")
    public MovieInfo getMovieById(@RequestParam(value = "id") Long movieId) {
        return movieService.getMovieInfo(movieId);
    }
}
