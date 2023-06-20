package com.careerit.jfs.cj.day19.playerstats;

public enum Role {

  BATSMAN("Batsman"),
  BOWLER("Bowler"),
  ALL_ROUNDER("All-Rounder"),
  WICKETKEEPER("WK-Batsman");

  private final String roleName;

  Role(String roleName) {
    this.roleName = roleName;
  }

  public String getRoleName() {
    return roleName;
  }
  public static Role getRole(String roleName) {
    for(Role role:Role.values()) {
      if(role.getRoleName().equals(roleName)) {
        return role;
      }
    }
    throw new IllegalArgumentException("Invalid role name :"+roleName);
  }


}
