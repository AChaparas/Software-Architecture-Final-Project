package edu.wctc.PlayerObjects;

public class AttackStandard implements AttackBehaviour{

    int attackValue = 10;

    @Override
    public int attack() {
        //Standard Attack deals 10 Damage
        return attackValue;
    }

}
