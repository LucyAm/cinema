package com.aca.cinema.domain;

public class MovieHeader {

    private Long id;
    private String name;
    private String posterUrl;
    private String genre;
    private String nowUpcoming;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNowUpcoming() {
        return nowUpcoming;
    }

    public void setNowUpcoming(String nowUpcoming) {
        this.nowUpcoming = nowUpcoming;
    }
}
