package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class StrongPlayer extends Player{

    public StrongPlayer(String playerName, AttackValueBroker attackTable) {
        this.playerName = playerName;
        attackBehaviour = new AttackHeavy(attackTable);
        healthBehaviour = new HealthLarge();
    }

}
