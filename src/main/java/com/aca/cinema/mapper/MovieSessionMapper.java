package com.aca.cinema.mapper;

import com.aca.cinema.domain.MovieSession;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieSessionMapper implements RowMapper<MovieSession> {
    @Override
    public MovieSession mapRow(ResultSet resultSet, int i) throws SQLException {
        MovieSession movieSession = new MovieSession();
        movieSession.setSessionId(resultSet.getLong("id"));
        movieSession.setCinemaId(resultSet.getLong("cinema_id"));
        movieSession.setCinemaName(resultSet.getNString("cinema_name"));
        movieSession.setTicketPrice(resultSet.getInt("ticket_price"));
        movieSession.setHall(resultSet.getNString("hall"));
        movieSession.setDate(resultSet.getDate("date"));

        return movieSession;
    }
}
