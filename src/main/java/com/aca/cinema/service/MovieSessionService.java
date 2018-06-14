package com.aca.cinema.service;

import com.aca.cinema.domain.CinemaSession;
import com.aca.cinema.domain.MovieSession;
import com.aca.cinema.mapper.CinemaSessionMapper;
import com.aca.cinema.mapper.MovieSessionMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieSessionService {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CinemaSession> getCinemaSessions(Long cinemaId){
        return jdbcTemplate.query("SELECT\n" +
                " movies.name,\n" +
                " sessions.hall,\n" +
                " sessions.date,\n" +
                " sessions.language,\n" +
                " sessions.dimension,\n" +
                " sessions.ticket_price\n" +
                "FROM sessions\n" +
                " INNER JOIN movies ON sessions.movie_id = movies.id\n" +
                "WHERE sessions.cinema_id = ?  AND DATE_FORMAT(sessions.date, '%Y%m%d') = CURDATE()\n" +
                "ORDER BY sessions.hall, sessions.date;",
                new Object[]{cinemaId},
                new CinemaSessionMapper());
    }

    public List<MovieSession> getMovieSessions(Long movieId){
        return jdbcTemplate.query("SELECT\n" +
                        " s.id,\n" +
                        " s.cinema_id,\n" +
                        " c.name AS cinema_name,\n" +
                        " s.ticket_price,\n" +
                        " s.hall,\n" +
                        " s.date\n" +
                        "FROM sessions s\n" +
                        " INNER JOIN movies m ON s.movie_id = m.id INNER JOIN cinemas c ON s.cinema_id = c.id\n" +
                        "WHERE m.id = ? AND s.date >= date_add(utc_timestamp, INTERVAL 4 HOUR) OR\n" +
                        "     (date_add(utc_timestamp, INTERVAL 4 HOUR) BETWEEN s.date AND date_add(date, INTERVAL m.duration * 1 MINUTE))\n" +
                        "ORDER BY date ASC;",
                new Object[]{movieId},
                new MovieSessionMapper());
    }
}
