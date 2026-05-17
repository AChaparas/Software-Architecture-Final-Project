package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.EnemyHealthBehaviour;

public class EnemyHealthLarge implements EnemyHealthBehaviour {

    int healthValue = 24;

    @Override
    public int healthValue() {
        return healthValue;
    }

    @Override
    public void healthDamage() {
        healthValue--;
    }

}
