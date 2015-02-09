package fr.ape.test.spring.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import fr.ape.test.spring.web.interceptor.LoggingRequestInterceptor;

/**
 * Configuration for spring mvc.
 * 
 * @author apenvern
 *
 */
@EnableWebMvc
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new LoggingRequestInterceptor()).addPathPatterns("/services/**");
  }

}
