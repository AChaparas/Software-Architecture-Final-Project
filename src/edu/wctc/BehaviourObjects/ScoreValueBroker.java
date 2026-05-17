package edu.wctc.BehaviourObjects;

import java.util.HashMap;

public class ScoreValueBroker {

    public HashMap<String, Integer> scoreValues = new HashMap<>();
    private static ScoreValueBroker instance = new ScoreValueBroker();

    private ScoreValueBroker() {
        fillScoreValueList();
        instance = this;
    }

    public static ScoreValueBroker getInstance() {
        return instance;
    }

    public void fillScoreValueList() {

        scoreValues.put("Weak Enemy Score", 10);
        scoreValues.put("Basic Enemy Score", 30);
        scoreValues.put("Strong Enemy Score", 50);

    }

}
