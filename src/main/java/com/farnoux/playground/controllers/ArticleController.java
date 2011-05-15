package com.farnoux.playground.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.farnoux.playground.models.Article;

@Controller
@RequestMapping("/articles")
public class ArticleController {

  @RequestMapping(method = RequestMethod.GET)
  List<Article> list() {
    List<Article> l = new ArrayList<Article>();
    l.add(new Article(1, "The first day...", "I had not much to say."));
    l.add(new Article(2, "The second day...", "It wasn't better."));
    return l;
  }
  
  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  Article show(@PathVariable Long id) {
    Article a = new Article();
    a.id = id;
    a.body = "This is an article.";
    return a;
  }
  
  
//  @RequestMapping(value="/{day}", method = RequestMethod.GET)
//  List<Article> getForDay(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date day, Model model) {
////      return appointmentBook.getAppointmentsForDay(day);
//    
//    return null;
//  }

}
