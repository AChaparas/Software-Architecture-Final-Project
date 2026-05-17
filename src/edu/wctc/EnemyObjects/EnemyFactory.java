package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.BehaviourObjects.ScoreValueBroker;

public class EnemyFactory {

    public static Enemy getEnemy(int randomEnemyValue, AttackValueBroker attackTable, ScoreValueBroker scoreTable) {

        switch(randomEnemyValue){

            //Enemy Names aren't unique, so don't need to be flexible
            //You *could* make them flexible so they could be unique, but I ain't gonna spend a day writing Top 100 Baby Names Edition 43

            //I didn't remember how to have each case have multiple conditionals when I wrapped up the project.
            //I just remembered how. Putting that in before going to bed

            case 0, 1, 2, 3, 4:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);

            case 5, 6, 7, 8:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);

            case 9:
                return new StrongEnemy("Strong Enemy", attackTable, scoreTable);

            default:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);

        }

    }

}
