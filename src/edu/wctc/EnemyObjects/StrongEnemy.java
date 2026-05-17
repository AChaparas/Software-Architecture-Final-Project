package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class StrongEnemy extends Enemy{

    public StrongEnemy(String enemyName, AttackValueBroker attackTable){

        this.enemyName = enemyName;
        attackBehaviour = new EnemyAttackStrong(attackTable);
        healthBehaviour = new EnemyHealthLarge();

    }

}
