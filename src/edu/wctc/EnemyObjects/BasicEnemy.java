package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class BasicEnemy extends Enemy{

    public BasicEnemy(String enemyName, AttackValueBroker attackTable){

        this.enemyName = enemyName;
        attackBehaviour = new EnemyAttackNormal(attackTable);
        healthBehaviour = new EnemyHealthStandard();

    }

}
