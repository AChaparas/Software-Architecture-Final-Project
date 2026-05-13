package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.PlayerHealthBehaviour;

public class HealthStandard implements PlayerHealthBehaviour {

    int healthValue = 20;
    int armorValue = 5;
    int armorAmount = 15;

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
