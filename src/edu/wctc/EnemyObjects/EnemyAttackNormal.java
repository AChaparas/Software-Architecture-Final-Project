package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.AttackValueBroker;

public class EnemyAttackNormal implements AttackBehaviour {

    int attackValue;

    public EnemyAttackNormal(AttackValueBroker attackTable) {

        attackValue = attackTable.attackValues.get("Standard Attack - Enemy");

    }

    @Override
    public int attack() {
        return attackValue;
    }
}
