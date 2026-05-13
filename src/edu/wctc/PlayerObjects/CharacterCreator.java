package edu.wctc.PlayerObjects;

import edu.wctc.IOHandler;

public class CharacterCreator {

    public static Player characterCreator(IOHandler ioHandler) {

        String playerName = creatorIntro(ioHandler);
        char classChoicer;

        do {
            classChoicer = creatorClassChoicer(ioHandler, playerName);

            if (classChoicer != 'S' && classChoicer != 'B' && classChoicer != 'Q') {

                do {
                    classChoicer = creatorClassTryAgain(ioHandler, playerName);
                } while (classChoicer != 'S' && classChoicer != 'B' && classChoicer != 'Q');

            }

        } while (classChoicer != 'S' && classChoicer != 'B' && classChoicer != 'Q');

        ioHandler.outputText("Generating your character...");

        return PlayerFactory.getPlayer(classChoicer, playerName);

    }

    //==================================================

    private static String creatorIntro(IOHandler ioHandler) {

        String intro = """
                A courageous choice! Let us begin!
                Please input your name:
                """;

        return ioHandler.getText(intro);

    }

    private static char creatorClassChoicer(IOHandler ioHandler, String nameChoice) {

        String classChoicer = "Welcome " + nameChoice + "!\nPlease select your class, would you like to play as a [S]trong Class, [B]asic class, or a [Q]uick class?\n";
        return ioHandler.getChar(classChoicer);

    }

    private static char creatorClassTryAgain(IOHandler ioHandler, String nameChoice) {

        String classChoicer = "C'mon. Please.\n[S]trong Class, [B]asic class, or a [Q]uick class?\n";
        return ioHandler.getChar(classChoicer);

    }

}
