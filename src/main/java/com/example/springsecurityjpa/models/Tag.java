package com.example.springsecurityjpa.models;

public class Tag {
    private Long idTag;
    private String nameTag;
    private String comment;

    public Tag() {

    }

    public Tag(Long idTag, String nameTag, String comment) {
        this.idTag = idTag;
        this.nameTag = nameTag;
        this.comment = comment;
    }

    public Long getIdTag() {
        return idTag;
    }

    public void setIdTag(Long idTag) {
        this.idTag = idTag;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
