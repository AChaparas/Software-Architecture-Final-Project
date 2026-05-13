package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class AttackLight implements AttackBehaviour {

    int attackValue;

    public AttackLight(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Light Attack - Player");

    }

    @Override
    public int attack() {
        //Light Attack deals 5 Damage
        return attackValue;
    }

}
