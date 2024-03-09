package com.dailycodebuffer.eventservice.model;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private Long id;
    private String eventName;
    private LocalDate eventDate;
    private String eventReason;
    private String eventLocation;
    private List<Guest> eventGuestList;
    private List<Guest> eventResponseList;
    private LocalTime eventTime;
    private List<Guest> guests = new ArrayList<>();


    public Event() {
    }

    public Event(Long id, String eventName, LocalDate eventDate, String eventReason, String eventLocation, List<Guest> eventGuestList, List<Guest> eventResponseList, LocalTime eventTime) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventReason = eventReason;
        this.eventLocation = eventLocation;
        this.eventGuestList = eventGuestList;
        this.eventResponseList = eventResponseList;
        this.eventTime = eventTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventReason() {
        return eventReason;
    }

    public void setEventReason(String eventReason) {
        this.eventReason = eventReason;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public List<Guest> getEventGuestList() {
        return eventGuestList;
    }

    public void setEventGuestList(List<Guest> eventGuestList) {
        this.eventGuestList = eventGuestList;
    }

    public List<Guest> getEventResponseList() {
        return eventResponseList;
    }

    public void setEventResponseList(List<Guest> eventResponseList) {
        this.eventResponseList = eventResponseList;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventReason='" + eventReason + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventGuestList=" + eventGuestList +
                ", eventResponseList=" + eventResponseList +
                ", eventTime=" + eventTime +'\''+
                ", guests=" + guests +
                '}';
    }
    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> employees) {
        this.guests = employees;
    }
}

