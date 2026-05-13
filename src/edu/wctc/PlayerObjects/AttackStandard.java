package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class AttackStandard implements AttackBehaviour {

    int attackValue;

    public AttackStandard(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Standard Attack - Player");

    }

    @Override
    public int attack() {
        return attackValue;
    }

}
