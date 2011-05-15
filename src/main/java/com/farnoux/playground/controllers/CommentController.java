package com.farnoux.playground.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farnoux.playground.models.Comment;

@Controller
@RequestMapping("/comments")
public class CommentController {

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  List<Comment> list() {
    List<Comment> l = new ArrayList<Comment>(2);
    l.add(new Comment(1, "I am the first comment :)"));
    l.add(new Comment(2, "I am the second :("));
    return l;
  }
  
    
  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  Comment show(@PathVariable Long id) {
    Comment c = new Comment();
    c.id = id;
    c.text = "This is a comment.";
    return c;
  }
  
}
