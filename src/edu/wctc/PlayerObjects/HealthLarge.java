package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.PlayerHealthBehaviour;

public class HealthLarge implements PlayerHealthBehaviour {

    int healthValue = 50;
    int armorValue = 0;
    int armorAmount = 5;

    @Override
    public int healthValue() {
        return healthValue;
    }

    @Override
    public int armorValue() {
        return armorValue;
    }

    @Override
    public void healthDamage() {
        healthValue--;
    }

    @Override
    public void armorDamage() {
        armorValue--;
    }

    @Override
    public void gainArmor() {
        armorValue += armorAmount;
    }

}
