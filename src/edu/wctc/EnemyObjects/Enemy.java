package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.DamageBehaviour;
import edu.wctc.BehaviourObjects.EnemyHealthBehaviour;
import edu.wctc.DamageCalculation;
import edu.wctc.BehaviourObjects.AttackBehaviour;

public abstract class Enemy {

    protected AttackBehaviour attackBehaviour;
    protected EnemyHealthBehaviour healthBehaviour;
    protected DamageBehaviour damageBehaviour;
    protected String enemyName;
    protected int scoreValue;

    public Enemy() {
        this.damageBehaviour = new DamageCalculation();
    }

    //Returns the current health value
    public int getHealth() {

        return healthBehaviour.healthValue();

    }

    //Returns the current attack value
    public int getAttackValue() {

        return attackBehaviour.attack();

    }

    //Damage Calculation
    public void enemyTakeDamage(int incomingDamage, EnemyHealthBehaviour healthBehaviour) {

        //System.out.println(incomingDamage);
        damageBehaviour.enemyTakeDamage(incomingDamage, healthBehaviour);

    }

    //Returns the Entity's Health Values
    public EnemyHealthBehaviour getHealthBehaviour() {
        return healthBehaviour;
    }


}
