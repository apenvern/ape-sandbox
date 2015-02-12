package com.github.ape.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple Hello world REST controller.
 * <p>
 * {@link RestController} is the same as {@code @Controller} and {@code @ResponseBody}. All your
 * method will have a {@code @ResponseBody}.
 * 
 * @author apenvern
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String index() {
    return "Hello World";
  }

}
