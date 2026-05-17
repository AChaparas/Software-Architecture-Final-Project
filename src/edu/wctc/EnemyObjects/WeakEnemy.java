package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class WeakEnemy extends Enemy{

    public WeakEnemy(String enemyName, AttackValueBroker attackTable) {

        this.enemyName = enemyName;
        attackBehaviour = new EnemyAttackWeak(attackTable);
        healthBehaviour = new EnemyHealthFrail();

    }

}
