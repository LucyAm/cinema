package com.aca.cinema.domain;

import java.util.Date;

public class MovieSession {

    private Long sessionId;
    private Long cinemaId;
    private String cinemaName;
    private Integer ticketPrice;
    private String hall;
    private Date date;

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long id) {
        this.sessionId = sessionId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
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

    @Override
    public String toString() {
        return "MovieSession{" +
                "sessionId=" + sessionId+
                ", cinemaId=" + cinemaId +
                ", cinemaName='" + cinemaName + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", hall='" + hall + '\'' +
                ", date=" + date +
                '}';
    }
}
