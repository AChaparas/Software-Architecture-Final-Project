package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class EnemyAttackStrong implements AttackBehaviour {

    int attackValue;

    public EnemyAttackStrong(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Strong Attack - Enemy");

    }

    @Override
    public int attack() {
        return attackValue;
    }
}
