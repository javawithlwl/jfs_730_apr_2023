package com.careerit.jfs.cj.day19.playerstats;

public class TeamStatsDto {

    private String team;
    private double amount;

    public TeamStatsDto(String team, double amount) {
        this.team = team;
        this.amount = amount;
    }
    public String getTeam() {
        return team;
    }
    public double getAmount() {
        return amount;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
