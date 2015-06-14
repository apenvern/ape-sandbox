package com.github.ape.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * The class is responsible for the startup and basic configuration of Spring Boot. This is the
 * first entry point for Spring. <br>
 * {@link EnableAutoConfiguration @EnableAutoConfiguration} tells Spring Boot to start adding beans
 * based on classpath settings, other beans, and various property settings. <br>
 * {@link ComponentScan @ComponentScan} Configures component scanning directives for use with @Configuration
 * classes. Provides support parallel with Spring XML's <context:component-scan> element.
 * 
 * @author apenvern
 */
@SpringBootApplication
@EnableAdminServer
public class AppConfig extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(AppConfig.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(AppConfig.class, args);
  }

}
