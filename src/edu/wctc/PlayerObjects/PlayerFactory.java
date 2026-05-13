package edu.wctc.PlayerObjects;

import edu.wctc.BehaviourObjects.AttackValueBroker;

public class PlayerFactory {

    public static Player getPlayer(char classChoice, String playerName, AttackValueBroker attackTable) {

        switch (classChoice) {
            case 'S':
                return new StrongPlayer(playerName, attackTable);
            case 'B':
                return new BasePlayer(playerName, attackTable);
            case 'Q':
                return new QuickPlayer(playerName, attackTable);
            default:
                return new BasePlayer(playerName, attackTable);
        }

    }

}
