package com.github.ape.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The class is responsible for the startup and basic configuration of Spring Boot. This is the
 * first entry point for Spring.
 * <p>
 * {@link EnableAutoConfiguration} tells Spring Boot to start adding beans based on classpath
 * settings, other beans, and various property settings.
 * <p>
 * {@link ComponentScan} Configures component scanning directives for use with @Configuration
 * classes. Provides support parallel with Spring XML's <context:component-scan> element.
 * 
 * @author apenvern
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.github.ape.spring"})
public class AppConfig {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AppConfig.class, args);
    }

}