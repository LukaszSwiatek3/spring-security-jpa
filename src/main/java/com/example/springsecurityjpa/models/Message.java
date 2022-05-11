package com.example.springsecurityjpa.models;


public class Message {
    private Long idMessage;
    private Long idConversation;
    private String messageSender;
    private String contentMessage;

    public Message() {

    }

    public Message(Long idMessage, Long idConversation, String messageSender, String contentMessage) {
        this.idMessage = idMessage;
        this.idConversation = idConversation;
        this.messageSender = messageSender;
        this.contentMessage = contentMessage;
    }

    public Long getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Long idMessage) {
        this.idMessage = idMessage;
    }

    public Long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }

    public String getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }

    public String getContentMessage() {
        return contentMessage;
    }

    public void setContentMessage(String contentMessage) {
        this.contentMessage = contentMessage;
    }
}
