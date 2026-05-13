package edu.wctc.PlayerObjects;

public class QuickPlayer extends Player{

    public QuickPlayer(String playerName) {
        this.playerName = playerName;
        attackBehaviour = new AttackLight();
        healthBehaviour = new HealthLight();
    }

}
