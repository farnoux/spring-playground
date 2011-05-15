package com.farnoux.playground.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;
import org.springframework.web.servlet.view.xml.MarshallingView;


@Configuration
public class AppConfiguration {

  @Bean
  ContentNegotiatingViewResolver viewResolver() {
    // Configure media types
    Map<String, String> mediaTypes = new HashMap<String, String>();
    mediaTypes.put("html", "text/html");
    mediaTypes.put("json", "application/json");
    mediaTypes.put("xml", "application/xml");

    // Configure simple views
    List<View> views = new ArrayList<View>();
    views.add(jsonView());
    views.add(xmlView());

    // Configure template view resolvers
    List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
    viewResolvers.add(jspViewResolver());
    

    // Finally configure the Content Negotiation View Resolver
    ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
    viewResolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
    viewResolver.setIgnoreAcceptHeader(true);

    viewResolver.setMediaTypes(mediaTypes);
    viewResolver.setDefaultViews(views);
    viewResolver.setViewResolvers(viewResolvers);

    return viewResolver;
  }

  
  /**
   * View in charge of rendering JSON request.
   */
  @Bean
  MappingJacksonJsonView jsonView() {
    MappingJacksonJsonView jsonView = new MappingJacksonJsonView();
//    jsonView.setPrefixJson(true);
    return jsonView;
  }
  
  /**
   * View in charge of rendering XML request.
   */
  @Bean
  MarshallingView xmlView(){
    MarshallingView xmlView = new MarshallingView();
    xmlView.setMarshaller(new XStreamMarshaller());
    return xmlView;
  }
  
  

//  @Bean
//  ViewResolver mustacheViewResolver() {
//    MustacheViewResolver viewResolver = new MustacheViewResolver();
//    viewResolver.setContentType("text/html;charset=utf-8");
//    viewResolver.setPrefix("/WEB-INF/templates/");
//    viewResolver.setSuffix(".mustache");
//    return viewResolver;
//  }
  
  @Bean
  ViewResolver jspViewResolver() {
    UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
    viewResolver.setContentType("text/html;charset=utf-8");
    viewResolver.setViewClass(InternalResourceView.class);
    viewResolver.setPrefix("/WEB-INF/templates/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }

  
}