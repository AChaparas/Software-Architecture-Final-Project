package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.EnemyHealthBehaviour;

public class EnemyHealthStandard implements EnemyHealthBehaviour {

    int healthValue = 16;

    @Override
    public int healthValue() {
        return healthValue;
    }

    @Override
    public void healthDamage() {
        healthValue--;
    }

}
