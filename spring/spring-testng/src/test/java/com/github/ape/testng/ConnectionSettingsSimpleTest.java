package com.github.ape.testng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.ape.config.ConnectionSettings;
import com.github.ape.utils.TestConfig;


/**
 * This class is a simple test to see how to use TestNG with Spring and how to test the
 * configuration loading. To use TestNG with Spring the test class should extend
 * {@link AbstractTestNGSpringContextTests}.
 * <p>
 * {@link ActiveProfiles @Activeprofiles} active the profile "unit-test".<br>
 * {@link ContextConfiguration @ContextConfiguration} defines class-level metadata that is used to
 * determine how to load and configure an ApplicationContext for integration tests.<br>
 * {@link ConfigFileApplicationContextInitializer @ConfigFileApplicationContextInitializer} is an
 * ApplicationContextInitializer that can apply to your tests to load Spring Boot
 * application.properties files. You can use this when you don’t need the full features provided by
 * {@link SpringApplicationConfiguration @SpringApplicationConfiguration}
 * 
 * @author apenvern
 *
 */
@ActiveProfiles("unit-test")
@ContextConfiguration(classes = TestConfig.class,
    initializers = ConfigFileApplicationContextInitializer.class)
public class ConnectionSettingsSimpleTest extends AbstractTestNGSpringContextTests {

  @Autowired
  ConnectionSettings connectionSettings;

  @Test
  public void getPasswordTest() {
    Assert.assertEquals(connectionSettings.getPassword(), "admintest");
  }

  @Test
  public void getRemoteAddressTest() {
    Assert.assertEquals(connectionSettings.getRemoteAddress().getHostAddress(), "192.168.1.2");
  }

  @Test
  public void getUsernameTest() {
    Assert.assertEquals(connectionSettings.getUsername(), "admin");
  }

}
