package com.aca.cinema.mapper;

import com.aca.cinema.domain.MovieInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieInfoMapper implements RowMapper<MovieInfo> {
    @Override
    public MovieInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        MovieInfo movieInfo = new MovieInfo();
        movieInfo.setId(resultSet.getLong("id"));
        movieInfo.setName(resultSet.getNString("name"));
        movieInfo.setDirector(resultSet.getNString("director"));
        movieInfo.setWriters(resultSet.getNString("writers"));
        movieInfo.setStars(resultSet.getNString("stars"));
        movieInfo.setReleased(resultSet.getNString("released"));
        movieInfo.setDescription(resultSet.getNString("description"));
        movieInfo.setGenre(resultSet.getNString("genre"));
        movieInfo.setDuration(resultSet.getNString("duration"));
        movieInfo.setPosterUrl(resultSet.getNString("poster_url"));
        movieInfo.setTrailerUrl(resultSet.getNString("trailer_url"));

        return movieInfo;
    }
}
