package edu.wctc.PlayerObjects;

public class HealthLarge implements HealthBehaviour {

    int healthValue = 50;
    int armorValue = 0;

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
    public void gainArmor(int armorAmount) {
        armorValue += armorAmount;
    }

}
