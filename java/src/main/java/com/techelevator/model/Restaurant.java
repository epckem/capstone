package com.techelevator.model;


import java.time.LocalTime;

public class Restaurant {
    private int restaurant_id;
    private  String name;
    private String city;
    private  String state;
    private int zipcode;
    private String type;
    private LocalTime open;
    private LocalTime close;
    private double rating;
    private String address;

    public Restaurant(int restaurant_id, String name,  String type,String address,String city, String state, int zipcode, LocalTime open, LocalTime close, double rating) {
        this.restaurant_id = restaurant_id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.type = type;
        this.open = open;
        this.close = close;
        this.rating = rating;
        this.address = address;
    }

    public int getId(){
        return restaurant_id;
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

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public double getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public LocalTime getOpen() {
        return open;
    }

    public LocalTime getClose() {
        return close;
    }
}

