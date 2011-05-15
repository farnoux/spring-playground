package com.farnoux.playground.models;

import java.util.Date;

public class Article {

  public Long id;
  public User author;
  public Date creation;
  public String title;
  public String body;

  public Article() {
    this.creation = new Date();
  }

  public Article(Number id, String title, String body) {
    this();
    this.id = id.longValue();
    this.title = title;
    this.body = body;
  }
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Date getCreation() {
    return creation;
  }

  public void setCreation(Date creation) {
    this.creation = creation;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

}
