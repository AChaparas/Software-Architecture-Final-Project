package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class QuickPlayer extends Player{

    public QuickPlayer(String playerName, AttackValueBroker attackTable) {
        this.playerName = playerName;
        attackBehaviour = new AttackLight(attackTable);
        healthBehaviour = new HealthLight();
    }

}
