package edu.wctc.PlayerObjects;

public class BasePlayer extends Player{

    public BasePlayer(String playerName) {
        this.playerName = playerName;
        attackBehaviour = new AttackStandard();
        healthBehaviour = new HealthStandard();
    }

}
