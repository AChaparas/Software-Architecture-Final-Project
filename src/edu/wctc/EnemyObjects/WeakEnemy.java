package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class WeakEnemy extends Enemy{

    public WeakEnemy(AttackValueBroker attackTable) {

        attackBehaviour = new EnemyAttackWeak(attackTable);

    }

}
