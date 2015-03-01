package com.github.ape.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.ape.Application;

/**
 * The class is responsible for the basic configuration of unit-test. It replace the
 * {@link Application}.<br>
 * {@link Profile @Profile} Set the profile "unit-test". For use it should be actived. <br>
 * {@link Configuration @Configuration} tells Spring to treat this as a configuration class and
 * register it as a Bean. <br>
 * 
 * @author apenvern
 */
@Profile("unit-test")
@Configuration
@ComponentScan({"com.github.ape"})
public class TestConfig {

}
