package com.careerit.jfs.cj.day22;

public class LoginServiceManager {

  public static void main(String[] args) {

    LoginService loginService = new LoginService();
    User user = loginService.login("krish", "krish123");
    System.out.println(user);

  }
}
