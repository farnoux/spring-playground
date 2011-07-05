package com.farnoux.spring.web.servlet.view.mustache;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.view.AbstractTemplateViewResolver;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import com.sampullara.mustache.Mustache;
import com.sampullara.mustache.MustacheCompiler;
import com.sampullara.mustache.MustacheException;


public class MustacheViewResolver extends AbstractTemplateViewResolver {

  @Autowired
  private ResourceLoader resourceLoader;

  private MustacheCompiler compiler;



  public MustacheViewResolver() {
    setViewClass(MustacheView.class);
  }


  @PostConstruct
  void initialize() throws IOException {
    File root = this.resourceLoader.getResource("").getFile();
    this.compiler = new MustacheCompiler(root);
  }

  @Override
  protected Class<?> requiredViewClass() {
    return MustacheView.class;
  }

  @Override
  protected AbstractUrlBasedView buildView(String viewName) throws Exception {
    MustacheView view = (MustacheView) super.buildView(viewName);
    
    try {
      Mustache m = this.compiler.parseFile(view.getUrl());
      view.setMustache(m);
    }
    catch (MustacheException e) {
      // TODO: handle exception
    }
    return view;
  }

}
