package edu.wctc.BehaviourObjects;

public interface DamageBehaviour {

    public void takeDamage(int incomingDamage, PlayerHealthBehaviour healthBehaviour);
    public void enemyTakeDamage(int incomingDamage, EnemyHealthBehaviour healthBehaviour);

}
