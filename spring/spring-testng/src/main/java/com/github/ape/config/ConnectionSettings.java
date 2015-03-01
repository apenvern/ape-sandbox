package com.github.ape.config;

import java.net.InetAddress;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Bean containing the connection properties.<br>
 * {@link Configuration @Configuration} tells Spring to treat this as a configuration class and
 * register it as a Bean.<br>
 * {@link ConfigurationProperties @ConfigurationProperties} tells Spring that bean will load from
 * externalized configuration and witch section use.
 * 
 * @author apenvern
 *
 */
@Configuration
@ConfigurationProperties(prefix = "connection")
public class ConnectionSettings {

  private String username;
  private String password;
  private InetAddress remoteAddress;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InetAddress getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(InetAddress remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

}
