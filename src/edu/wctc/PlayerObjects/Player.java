package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackBehaviour;
import edu.wctc.BehaviourObjects.PlayerHealthBehaviour;
import edu.wctc.BehaviourObjects.DamageBehaviour;
import edu.wctc.BehaviourObjects.DamageCalculation;

public abstract class Player {

    protected AttackBehaviour attackBehaviour;
    protected PlayerHealthBehaviour healthBehaviour;
    protected DamageBehaviour damageBehaviour;
    protected String playerName;
    protected int playerScore;

    //Base Constructor
    public Player() {
        this.damageBehaviour = new DamageCalculation();
    }

    //Returns the current health value
    public int getHealth() {

        return healthBehaviour.healthValue();

    }

    //Returns the current armor value
    public int getArmor() {

        return healthBehaviour.armorValue();

    }

    //Returns the current attack value
    public int getAttackValue() {

        return attackBehaviour.attack();

    }

    //Kinda hacky way to have the player gain Armor
    public void gainArmor(int armorAmount) {

        healthBehaviour.gainArmor();

    }

    //Adds score value from felled enemies to players score value
    public void addToScore(int scoreValue) {

        playerScore += scoreValue;

    }

    //Damage Calculation
    public void takeDamage(int incomingDamage, PlayerHealthBehaviour healthBehaviour) {

        System.out.println(incomingDamage);
        damageBehaviour.takeDamage(incomingDamage, healthBehaviour);

    }

    //Returns the Entity's Health Values
    public PlayerHealthBehaviour getHealthBehaviour() {
        return healthBehaviour;
    }

}
