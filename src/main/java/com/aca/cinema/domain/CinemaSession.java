package com.aca.cinema.domain;

import java.util.Date;

public class CinemaSession {

    private String movieName;
    private String hall;
    private Date date;
    private String language;
    private String dimension;
    private Integer ticketPrice;

    public String getCinemaName() {
        return movieName;
    }

    public void setMovieName(String cinemaName) {
        this.movieName = movieName;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "CinemaSession{" +
                "movieName='" + movieName + '\'' +
                ", hall='" + hall + '\'' +
                ", date=" + date +
                ", language='" + language + '\'' +
                ", dimension='" + dimension + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
