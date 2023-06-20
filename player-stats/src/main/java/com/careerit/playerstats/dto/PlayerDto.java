package com.careerit.playerstats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {
  private long id;
  private String name;
  private String team;
  private String country;
  private String role;
  private double amount;
}
