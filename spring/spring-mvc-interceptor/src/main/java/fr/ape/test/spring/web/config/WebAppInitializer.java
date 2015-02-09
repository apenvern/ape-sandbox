package fr.ape.test.spring.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Fisrt entry point for spring configuration. AbstractAnnotationConfigDispatcherServletInitializer
 * is an implementation of WebApplicationInitializer that replace web.xml
 * 
 * @author apenvern
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] {WebMvcConfiguration.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/"};
  }
}
