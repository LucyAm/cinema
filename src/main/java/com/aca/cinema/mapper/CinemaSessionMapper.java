package com.aca.cinema.mapper;

import com.aca.cinema.domain.CinemaSession;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CinemaSessionMapper implements RowMapper<CinemaSession> {
    @Override
    public CinemaSession mapRow(ResultSet resultSet, int i) throws SQLException {
        CinemaSession cinemaSession = new CinemaSession();
        cinemaSession.setMovieName(resultSet.getNString("name"));
        cinemaSession.setHall(resultSet.getNString("hall"));
        cinemaSession.setDate(resultSet.getDate("date"));
        cinemaSession.setLanguage(resultSet.getNString("language"));
        cinemaSession.setDimension(resultSet.getNString("dimension"));
        cinemaSession.setTicketPrice(resultSet.getInt("ticket_price"));

        return cinemaSession;
    }
}
