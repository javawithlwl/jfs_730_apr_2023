package com.careerit.sjdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {
  private String name;
  private String role;
  private String country;
  private double amount;
  private String team;
}
