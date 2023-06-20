package com.careerit.playerstats.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private long id;
    private String name;
    private String team;
    private String country;
    private String role;
    private double amount;
}
