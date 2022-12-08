package com.techelevator.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Event {
    private int eventId;
    private int userId;
    private String eventName;
    private String location;
    private Timestamp decisionDate;
    private String inviteUrl;

    public Event() {

    }

    public Event(int eventId, int userId, String eventName, String location, Timestamp decisionDate,  String inviteUrl) {
        this.eventId = eventId;
        this.userId = this.userId;
        this.eventName = eventName;
        this.location = location;
        this.decisionDate = decisionDate;
        this.inviteUrl = inviteUrl;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getDecisionDate() {
        return decisionDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getInviteUrl() {
        return inviteUrl;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDecisionDate(Timestamp decisionDate) {
        this.decisionDate = decisionDate;
    }

    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }
}
