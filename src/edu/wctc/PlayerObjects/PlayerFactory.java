package edu.wctc.PlayerObjects;

public class PlayerFactory {

    public static Player getPlayer(char classChoice, String playerName) {

        switch (classChoice) {
            case 'S':
                return new StrongPlayer(playerName);
            case 'B':
                return new BasePlayer(playerName);
            case 'Q':
                return new QuickPlayer(playerName);
            default:
                return new BasePlayer(playerName);
        }

    }

}
