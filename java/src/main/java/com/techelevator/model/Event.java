package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Event {
    private int eventId;
    private int userId;
    private String eventName;
    private String location;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime decisionDate;
    private String inviteCode;

    public Event() {

    }

    public Event(int eventId, int userId, String eventName, String location, LocalDateTime decisionDate,  String inviteCode) {
        this.eventId = eventId;
        this.userId = userId;
        this.eventName = eventName;
        this.location = location;
        this.decisionDate = decisionDate;
        this.inviteCode = inviteCode;
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

    public LocalDateTime getDecisionDate() {
        return decisionDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getInviteCode() {
        return inviteCode;
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

    public void setDecisionDate(LocalDateTime decisionDate) {
        this.decisionDate = decisionDate;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
}
