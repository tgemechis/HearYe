package com.company;

import java.util.ArrayList;

public class Event {
    private String title;
    private String eventDate;
    private ArrayList<Speaker> speaker;


    public Event() {
        speaker = new ArrayList<>();
    }

    public Event(String title, String eventDate) {
        this.title = title;
        this.eventDate = eventDate;
        speaker = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<Speaker> getSpeaker() {
        return speaker;
    }

    public void setSpeaker(ArrayList<Speaker> speaker) {
        this.speaker = speaker;
    }

    public String eventDetails(){
        return "Event Name: " + getTitle() + '\t' +
                "Speaker: " + getSpeaker() + '\t';
    }
}
