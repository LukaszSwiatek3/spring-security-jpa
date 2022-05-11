package com.example.springsecurityjpa.models;

import java.util.List;

public class Conversation {

    private Long idConversation;
    private String conversationName;
    private List<User> chatMembers;
    private List<Message> messages;

    public Conversation() {

    }

    public Conversation(Long idConversation, String conversationName, List<User> chatMembers, List<Message> messages) {
        this.idConversation = idConversation;
        this.conversationName = conversationName;
        this.chatMembers = chatMembers;
        this.messages = messages;
    }

    public Long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }

    public String getConversationName() {
        return conversationName;
    }

    public void setConversationName(String conversationName) {
        this.conversationName = conversationName;
    }

    public List<User> getChatMembers() {
        return chatMembers;
    }

    public void setChatMembers(List<User> chatMembers) {
        this.chatMembers = chatMembers;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
