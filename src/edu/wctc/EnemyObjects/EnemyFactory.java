package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class EnemyFactory {

    public static Enemy getEnemy(char enemyResult, AttackValueBroker attackTable) {

        switch(enemyResult){

            //Enemy Names aren't unique, so don't need to be flexible
            //You *could* make them flexible so they could be unique, but I ain't gonna spend a day writing Top 100 Baby Names Edition 43
            case 'W':
                return new WeakEnemy("Weak Enemy", attackTable);
            case 'B':
                return new BasicEnemy("Basic Enemy", attackTable);
            case 'S':
                return new StrongEnemy("Strong Enemy", attackTable);
            default:
                return new BasicEnemy("Basic Enemy", attackTable);

        }

    }

}
