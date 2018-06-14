package com.aca.cinema.service;

import com.aca.cinema.domain.MovieHeader;
import com.aca.cinema.domain.MovieInfo;
import com.aca.cinema.mapper.MovieHeaderMapper;
import com.aca.cinema.mapper.MovieInfoMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieService {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<MovieHeader> getMovieList() {
        return jdbcTemplate.query("SELECT\n" +
                " movies.id,\n" +
                " movies.name,\n" +
                " movies.poster_url,\n" +
                " movies.genre,\n" +
                " IF(MIN(DATE_FORMAT(sessions.date, '%Y%m%d')) = CURDATE(), 'NOW', 'UPCOMING') AS now_upcoming\n" +
                "FROM movies\n" +
                " INNER JOIN sessions ON movies.id = sessions.movie_id\n" +
                "where sessions.date >= cast(date_add(utc_timestamp, interval 4 hour) as date)\n" +
                "GROUP BY movies.id\n" +
                "ORDER BY now_upcoming", new MovieHeaderMapper());
    }
    public MovieInfo getMovieInfo(Long movieId) {
        return jdbcTemplate.queryForObject("SELECT *\n" +
                "FROM movies\n" +
                "WHERE id =?",
                new Object [] {movieId},
                new MovieInfoMapper());
    }
}
