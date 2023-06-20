package com.careerit.playerstats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsDto {

    private String team;
    private double totalAmount;
    private long count;
    private double maxAmount;
    private double minAmount;
    private double avgAmount;
}
