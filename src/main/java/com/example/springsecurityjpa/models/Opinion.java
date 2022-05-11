package com.example.springsecurityjpa.models;

import javax.persistence.*;

@Entity
@Table(name = "Opinions")
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOpinion;
    private Double rating;
    private String description;
    private User opinionAuthor;
    private String opinionTime;
    private Event event;

    public Opinion() {

    }

    public Opinion(Long idOpinion, Double rating, String description, User opinionAuthor, String opinionTime, Event event) {
        this.idOpinion = idOpinion;
        this.rating = rating;
        this.description = description;
        this.opinionAuthor = opinionAuthor;
        this.opinionTime = opinionTime;
        this.event = event;
    }

    public Opinion(Double rating, String description, User opinionAuthor, String opinionTime, Event event) {
        this.rating = rating;
        this.description = description;
        this.opinionAuthor = opinionAuthor;
        this.opinionTime = opinionTime;
        this.event = event;
    }



    public Long getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(Long idOpinion) {
        this.idOpinion = idOpinion;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOpinionAuthor() {
        return opinionAuthor;
    }

    public void setOpinionAuthor(User opinionAuthor) {
        this.opinionAuthor = opinionAuthor;
    }

    public String getOpinionTime() {
        return opinionTime;
    }

    public void setOpinionTime(String opinionTime) {
        this.opinionTime = opinionTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
