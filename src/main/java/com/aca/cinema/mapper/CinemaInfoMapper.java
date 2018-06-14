package com.aca.cinema.mapper;

import com.aca.cinema.domain.CinemaInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CinemaInfoMapper implements RowMapper<CinemaInfo> {

    @Override
    public CinemaInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        CinemaInfo cinemaInfo = new CinemaInfo();
        cinemaInfo.setId(resultSet.getLong("id"));
        cinemaInfo.setName(resultSet.getNString("name"));
        cinemaInfo.setAddress(resultSet.getNString("address"));
        cinemaInfo.setPhone(resultSet.getNString("phone"));
        cinemaInfo.setSiteUrl(resultSet.getNString("siteUrl"));
        cinemaInfo.setOpenClosed(resultSet.getNString("open_closed"));

        return cinemaInfo;
    }
}
