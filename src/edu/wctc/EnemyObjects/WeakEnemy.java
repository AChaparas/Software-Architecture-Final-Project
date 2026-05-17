package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.BehaviourObjects.ScoreValueBroker;

public class WeakEnemy extends Enemy{

    public WeakEnemy(String enemyName, AttackValueBroker attackTable, ScoreValueBroker scoreTable) {

        this.enemyName = enemyName;
        this.scoreValue = scoreTable.scoreValues.get("Weak Enemy Score");
        attackBehaviour = new EnemyAttackWeak(attackTable);
        healthBehaviour = new EnemyHealthFrail();

    }

}
