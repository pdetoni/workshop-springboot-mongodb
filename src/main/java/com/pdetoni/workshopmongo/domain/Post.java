package com.pdetoni.workshopmongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String title;
    private Date date;
    private String body;
    private User author;

    public Post(){

    }

    public Post(String id, String title, Date date, String body, User author) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.body = body;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Post post)) return false;

        return getId().equals(post.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
