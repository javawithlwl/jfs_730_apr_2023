package com.careerit.jfs.cj.day19.playerstats;

public class RoleStatDto {


  private Role role;
  private int count;
  private double amount;
  private double avgAmount;

  public RoleStatDto(Role role, int count, double amount, double avgAmount) {
    this.role = role;
    this.count = count;
    this.amount = amount;
    this.avgAmount = avgAmount;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getAvgAmount() {
    return avgAmount;
  }

  public void setAvgAmount(double avgAmount) {
    this.avgAmount = avgAmount;
  }
}
