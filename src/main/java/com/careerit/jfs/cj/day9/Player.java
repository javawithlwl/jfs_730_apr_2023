package com.careerit.jfs.cj.day9;

public class Player {

  private String name;
  private String role;
  private double amount;
  private String country;
  private String team;

  public Player(String name, String role, double amount, String country, String team) {
    this.name = name;
    this.role = role;
    this.amount = amount;
    this.country = country;
    this.team = team;
  }
  public void showDetails() {
    System.out.println(name+","+role+","+amount+","+country+","+team);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
