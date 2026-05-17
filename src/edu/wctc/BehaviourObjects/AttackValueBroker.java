package edu.wctc.BehaviourObjects;

import java.util.HashMap;

public class AttackValueBroker {

    //Broker, we didn't even learn this one in class, I had to ask about it

    public HashMap<String, Integer> attackValues = new HashMap<>();
    private static AttackValueBroker instance = new AttackValueBroker();

    //Stick another Singleton in this because I want exactly one copy of this list, we're not makin duplicates
    private AttackValueBroker() {
        fillAttackValueList();
        instance = this;
    }

    public static AttackValueBroker getInstance() {
        return instance;
    }

    public void fillAttackValueList() {

        //Player Attack Values
        attackValues.put("Strong Attack - Player", 15);
        attackValues.put("Standard Attack - Player", 10);
        attackValues.put("Light Attack - Player", 5);

        //Enemy Attack Values
        attackValues.put("Strong Attack - Enemy", 12);
        attackValues.put("Standard Attack - Enemy", 8);
        attackValues.put("Light Attack - Enemy", 4);

    }



}
