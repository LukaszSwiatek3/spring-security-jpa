package com.example.springsecurityjpa.models;

import java.time.LocalDateTime;
import java.util.List;

public class Event {

    private Long idEvent;
    private String nameEvent;
    private Long idAddress;
    private String startDateEvent;
    private String endDateEvent;
    private Long idUser;
    private Integer limitOfParticipants;
    private List<User> participants;
    private List<Tag> tags;
    private String description;

    public Event() {

    }

    public Event(Long idEvent, String nameEvent, Long idAddress, String startDateEvent, String endDateEvent, Long idUser, Integer limitOfParticipants, List<User> participants, List<Tag> tags, String description) {
        this.idEvent = idEvent;
        this.nameEvent = nameEvent;
        this.idAddress = idAddress;
        this.startDateEvent = startDateEvent;
        this.endDateEvent = endDateEvent;
        this.idUser = idUser;
        this.limitOfParticipants = limitOfParticipants;
        this.participants = participants;
        this.tags = tags;
        this.description = description;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getStartDateEvent() {
        return startDateEvent;
    }

    public void setStartDateEvent(String startDateEvent) {
        this.startDateEvent = startDateEvent;
    }

    public String getEndDateEvent() {
        return endDateEvent;
    }

    public void setEndDateEvent(String endDateEvent) {
        this.endDateEvent = endDateEvent;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Integer getLimitOfParticipants() {
        return limitOfParticipants;
    }

    public void setLimitOfParticipants(Integer limitOfParticipants) {
        this.limitOfParticipants = limitOfParticipants;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
