package edu.wctc.PlayerObjects;

public class AttackLight implements AttackBehaviour{

    int attackValue = 5;

    @Override
    public int attack() {
        //Light Attack deals 5 Damage
        return attackValue;
    }

}
