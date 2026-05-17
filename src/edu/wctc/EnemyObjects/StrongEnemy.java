package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.BehaviourObjects.ScoreValueBroker;

public class StrongEnemy extends Enemy{

    public StrongEnemy(String enemyName, AttackValueBroker attackTable, ScoreValueBroker scoreTable){

        this.enemyName = enemyName;
        this.scoreValue = scoreTable.scoreValues.get("Strong Enemy Score");
        attackBehaviour = new EnemyAttackStrong(attackTable);
        healthBehaviour = new EnemyHealthLarge();

    }

}
