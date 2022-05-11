package com.example.springsecurityjpa.models;

import java.util.UUID;

public class Ticket {
    private Long idTicket;
    private Event event;
    private UUID uuidCode;
    private Double price;

    public Ticket() {

    }

    public Ticket(Long idTicket, Event event, UUID uuidCode, Double price) {
        this.idTicket = idTicket;
        this.event = event;
        this.uuidCode = uuidCode;
        this.price = price;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public UUID getUuidCode() {
        return uuidCode;
    }

    public void setUuidCode(UUID uuidCode) {
        this.uuidCode = uuidCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
