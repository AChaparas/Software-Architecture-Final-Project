package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.BehaviourObjects.ScoreValueBroker;

public class BasicEnemy extends Enemy{

    public BasicEnemy(String enemyName, AttackValueBroker attackTable, ScoreValueBroker scoreTable){

        this.enemyName = enemyName;
        this.scoreValue = scoreTable.scoreValues.get("Basic Enemy Score");
        attackBehaviour = new EnemyAttackNormal(attackTable);
        healthBehaviour = new EnemyHealthStandard();

    }

}
