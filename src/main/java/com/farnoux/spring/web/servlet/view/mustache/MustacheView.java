package com.farnoux.spring.web.servlet.view.mustache;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractTemplateView;

import com.sampullara.mustache.Mustache;
import com.sampullara.util.FutureWriter;


public class MustacheView extends AbstractTemplateView {

  Mustache mustache;
  
  
  @Override
  protected void renderMergedTemplateModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType(getContentType());

    FutureWriter writer = new FutureWriter(response.getWriter());
    try {
      mustache.execute(writer, model);
    }
    finally {
      writer.flush();
    }    
  }

  public void setMustache(Mustache mustache) {
    this.mustache = mustache;
  }
}
