package edu.wctc.EnemyObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.BehaviourObjects.ScoreValueBroker;

public class EnemyFactory {

    public static Enemy getEnemy(int randomEnemyValue, AttackValueBroker attackTable, ScoreValueBroker scoreTable) {

        switch(randomEnemyValue){

            //Enemy Names aren't unique, so don't need to be flexible
            //You *could* make them flexible so they could be unique, but I ain't gonna spend a day writing Top 100 Baby Names Edition 43

            //Also. It's a bit annoying that I seemingly can't use Ranges for the switch statement conditionals.
            //I spent a while looking into this, because I didn't want to just have a list of 10 possible states.
            //I would've preferred something like what can be done in C#. I like C# better.

            case 0:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);
            case 1:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);
            case 2:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);
            case 3:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);
            case 4:
                return new WeakEnemy("Weak Enemy", attackTable, scoreTable);

            case 5:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);
            case 6:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);
            case 7:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);
            case 8:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);

            case 9:
                return new StrongEnemy("Strong Enemy", attackTable, scoreTable);

            default:
                return new BasicEnemy("Basic Enemy", attackTable, scoreTable);

        }

    }

}
