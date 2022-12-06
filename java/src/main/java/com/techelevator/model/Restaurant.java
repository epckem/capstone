package com.techelevator.model;


import java.time.LocalTime;

public class Restaurant {
    private int id;
    private  String name;
    private String city;
    private  String state;
    private int zipcode;
    private String type;
    private LocalTime open;
    private LocalTime close;

    public Restaurant(int id, String name, String city, String state, int zipcode, String type, LocalTime open, LocalTime close) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.type = type;
        this.open = open;
        this.close = close;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getType() {
        return type;
    }

    public LocalTime getOpen() {
        return open;
    }

    public LocalTime getClose() {
        return close;
    }
}

