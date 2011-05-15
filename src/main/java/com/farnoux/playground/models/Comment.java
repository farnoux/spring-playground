package com.farnoux.playground.models;

public class Comment {

  public Long id;
  public User author;
  public String text;

  public Comment() {
  }

  public Comment(Number id, String text) {
    this.id = id.longValue();
    this.text = text;
  }

}
