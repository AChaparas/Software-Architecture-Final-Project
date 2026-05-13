package edu.wctc.PlayerObjects;

public class StrongPlayer extends Player{

    public StrongPlayer(String playerName) {
        this.playerName = playerName;
        attackBehaviour = new AttackHeavy();
        healthBehaviour = new HealthLarge();
    }

}
