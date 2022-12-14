package com.techelevator.model;

public class Vote {

    private int restaurant_id;
    private int upVote;
    private int downVote;

    public Vote(int restaurant_id, int upVote, int downVote) {
        this.restaurant_id = restaurant_id;
        this.upVote = upVote;
        this.downVote = downVote;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }
}
