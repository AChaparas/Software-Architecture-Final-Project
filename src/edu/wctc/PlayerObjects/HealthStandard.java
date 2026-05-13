package edu.wctc.PlayerObjects;

public class HealthStandard implements HealthBehaviour {

    int healthValue = 20;
    int armorValue = 5;

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
