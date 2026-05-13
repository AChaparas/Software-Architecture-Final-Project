package edu.wctc.PlayerObjects;

public class AttackHeavy implements AttackBehaviour{

    int attackValue = 15;

    @Override
    public int attack() {
        //Heavy Attack deals 15 Damage
        return attackValue;
    }

}
