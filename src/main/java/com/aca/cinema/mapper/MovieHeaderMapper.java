package com.aca.cinema.mapper;

import com.aca.cinema.domain.MovieHeader;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieHeaderMapper implements RowMapper<MovieHeader> {
    @Override
    public MovieHeader mapRow(ResultSet resultSet, int i) throws SQLException {
        MovieHeader movieHeader = new MovieHeader();
        movieHeader.setId(resultSet.getLong("id"));
        movieHeader.setName(resultSet.getNString("name"));
        movieHeader.setPosterUrl(resultSet.getNString("poster_url"));
        movieHeader.setGenre(resultSet.getNString("genre"));
        movieHeader.setNowUpcoming(resultSet.getNString("now_upcoming"));

        return movieHeader;
    }
}
