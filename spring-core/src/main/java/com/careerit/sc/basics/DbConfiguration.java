package com.careerit.sc.basics;

import lombok.ToString;

import java.util.StringJoiner;


public class DbConfiguration {

  private String url;
  private String username;
  private String password;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

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

  @Override
  public String toString() {
    return new StringJoiner(", ", DbConfiguration.class.getSimpleName() + "[", "]")
        .add("url='" + url + "'")
        .add("username='" + username + "'")
        .add("password='" + password + "'")
        .toString();
  }
}
