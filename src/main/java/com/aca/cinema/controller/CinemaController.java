package com.aca.cinema.controller;

import com.aca.cinema.domain.CinemaInfo;
import com.aca.cinema.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @RequestMapping("/cinemas")
    public List<CinemaInfo> getCinemas() {
        return cinemaService.getCinemaList();
    }
}


