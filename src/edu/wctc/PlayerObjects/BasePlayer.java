package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class BasePlayer extends Player{

    public BasePlayer(String playerName, AttackValueBroker attackTable) {
        this.playerName = playerName;
        attackBehaviour = new AttackStandard(attackTable);
        healthBehaviour = new HealthStandard();
    }

}
