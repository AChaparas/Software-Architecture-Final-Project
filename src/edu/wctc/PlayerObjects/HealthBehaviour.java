package edu.wctc.PlayerObjects;

public interface HealthBehaviour {

    int healthValue();
    int armorValue();

    void healthDamage();
    void armorDamage();
    void gainArmor(int armorAmount);

}
