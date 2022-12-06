package com.techelevator.model;


import java.time.LocalTime;

public class Restaurant {
    private int restaurant_id;
    private String img;
    private  String name;
    private String description;
    private String type;
    private String address;
    private String city;
    private  String state;
    private int zipcode;
    private LocalTime open;
    private LocalTime close;
    private double rating;
    private String phoneNumber;

    public Restaurant() {
    }

    public Restaurant(int restaurant_id, String img, String name, String description, String type, String address, String city, String state, int zipcode, LocalTime open, LocalTime close, double rating, String phoneNumber) {
        this.restaurant_id = restaurant_id;
        this.img = img;
        this.name = name;
        this.description = description;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.type = type;
        this.open = open;
        this.close = close;
        this.rating = rating;
        this.phoneNumber = phoneNumber;

    }
//    public Restaurant(int restaurant_id, String img, String name, String type, String address, String city, String state, int zipcode, LocalTime open, LocalTime close, double rating) {
//        this.restaurant_id = restaurant_id;
//        this.img = img;
//        this.name = name;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.zipcode = zipcode;
//        this.type = type;
//        this.open = open;
//        this.close = close;
//        this.rating = rating;
//
//    }


    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setOpen(LocalTime open) {
        this.open = open;
    }

    public void setClose(LocalTime close) {
        this.close = close;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public String getImg() {
        return img;
    }
    public String getDescription() {
        return description;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + restaurant_id +
                "img url=" + img +
                ", name=" + name +
                ", description=" + description +
                ", type=" + type +
                ", address=" + address +
                ", city=" + city +
                ", state=" + state +
                ", zip-code=" + zipcode +
                ", open time=" + open +
                ", close time=" + close +
                ", rating=" + rating +
                '}';
    }
}

