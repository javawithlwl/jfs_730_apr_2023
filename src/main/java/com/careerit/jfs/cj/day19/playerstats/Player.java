package com.careerit.jfs.cj.day19.playerstats;


public class Player {

  private String name;
  private Role role;
  private String country;
  private double amount;
  private String team;

  public Player(String name, Role role, String country, double amount, String team) {
    this.name = name;
    this.role = role;
    this.country = country;
    this.amount = amount;
    this.team = team;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
