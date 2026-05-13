package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class AttackHeavy implements AttackBehaviour {

    int attackValue;

    public AttackHeavy(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Strong Attack - Player");

    }

    @Override
    public int attack() {
        return attackValue;
    }

}
