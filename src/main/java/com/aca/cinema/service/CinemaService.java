package com.aca.cinema.service;

import com.aca.cinema.domain.CinemaInfo;
import com.aca.cinema.mapper.CinemaInfoMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CinemaService {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CinemaInfo> getCinemaList() {
        return jdbcTemplate.query("SELECT\n" +
                "  id,\n" +
                "  name,\n" +
                "  address,\n" +
                "  phone,\n" +
                "  site_url,\n" +
                "  if(open_cinema_id IS NULL, 'CLOSED', 'OPEN') AS open_closed\n" +
                "FROM cinemas\n" +
                "  LEFT JOIN\n" +
                "  (SELECT\n" +
                "     DISTINCT cinema_id AS open_cinema_id\n" +
                "   FROM sessions\n" +
                "     INNER JOIN movies ON sessions.movie_id = movies.id\n" +
                "   WHERE date_add(utc_timestamp, INTERVAL 4 HOUR) BETWEEN date AND date_add(date, INTERVAL movies.duration * 1\n" +
                "                                                                            MINUTE)) open_cinemas\n" +
                "    ON cinemas.id = open_cinemas.open_cinema_id;", new CinemaInfoMapper());
    }

}
