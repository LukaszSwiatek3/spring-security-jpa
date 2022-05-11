package com.example.springsecurityjpa.models;

import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private List<Ticket> tickets;
    private User ticketBuyer;
    private String purchaseDateTime;
    private Double summaryCost;

    public Transaction() {

    }

    public Transaction(List<Ticket> tickets, User ticketBuyer, String purchaseDateTime, Double summaryCost) {
        this.tickets = tickets;
        this.ticketBuyer = ticketBuyer;
        this.purchaseDateTime = purchaseDateTime;
        this.summaryCost = summaryCost;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public User getTicketBuyer() {
        return ticketBuyer;
    }

    public void setTicketBuyer(User ticketBuyer) {
        this.ticketBuyer = ticketBuyer;
    }

    public String getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public void setPurchaseDateTime(String purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    public Double getSummaryCost() {
        return summaryCost;
    }

    public void setSummaryCost(Double summaryCost) {
        this.summaryCost = summaryCost;
    }
}