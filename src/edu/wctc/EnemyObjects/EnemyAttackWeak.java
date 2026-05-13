package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class EnemyAttackWeak implements AttackBehaviour {

    int attackValue;

    public EnemyAttackWeak(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Light Attack - Enemy");

    }

    @Override
    public int attack() {
        return attackValue;
    }
}
