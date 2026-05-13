package edu.wctc;

import edu.wctc.PlayerObjects.CharacterCreator;
import edu.wctc.PlayerObjects.Player;

public class GameCore {

    public void gameStart(IOHandler ioHandler) {

//        //Test stuff please ignore
//
//        ioHandler.outputText("Testing, testing! Mic Check One Two!\n" + "Am I on? Can everyone hear me? Okay, well then!\n" + "Uh... To all incoming students, I would like to begin the entrance ceremony at... at right now!\n" + "Please make your way to the gymnasium at your earliest convenience.\n" + "That's all. I'll be waiting...");
//        String testValue = getTestValue(ioHandler);
//        ioHandler.outputText(testValue);

        //==================================================

        //Actual Project starts here

        //First thing that comes to mind is a text-based combat game of some sort
            //I hesitate to use "fighting" game because no, it's absolutely not that

        //Not sure if I should dedicate a whole equipment system or not. I'll stick a Shield value here for now
            //I'm thinking something along the lines of Slay the Spire, where you play the Armor cards to gain defense that block some of the incoming damage wholesale.
        boolean playerAlive = true;
        char playerCharChoiceValue;
        //Ya see, this gives me a good excuse for what to use a Factory for. Gotta make enemies somehow!
            //For later though. For not let's get a base set up here.

        do {

            playerCharChoiceValue = gameIntro(ioHandler);
//            ioHandler.outputText(String.valueOf(playerCharChoiceValue));
            if (playerCharChoiceValue != 'Y' && playerCharChoiceValue != 'N') {

                do {

                    playerCharChoiceValue = gameIntroFail(ioHandler);

                } while (playerCharChoiceValue != 'Y' && playerCharChoiceValue != 'N');

            }

        } while (playerCharChoiceValue != 'Y' && playerCharChoiceValue != 'N');

        if (playerCharChoiceValue == 'Y') {

            //Player is ready, start main gameplay
            //Gotta lock the player into the eternal do loop of Doom
            do {

                //Time to dump you in the Character Creator for a bit
                Player playerCharacter = CharacterCreator.characterCreator(ioHandler);
                //This took a while to complete, but finally, you're ready to go

                //==================================================
                //Test Values to make sure armor and damage systems are working
                //They are, that took a lil while
                playerCharacter.gainArmor(20);

                playerCharacter.takeDamage(999);
                //==================================================


            } while (playerAlive); //This should check if a Player object has more than Zero health.
            //If it gets past this point, you're dead
            //Probably wanna do a game over right in this area, before it exits the Y choicer but after the player dies

        } else {
            ioHandler.outputText(gameAntiClimaxOutro());
        }

    }

    //==================================================
    //You'll find the game text prompts here.
    //Maybe I'll move these to a separate file, I'll likely be asking you about this in class

    private char gameIntro(IOHandler ioHandler) {

        String intro = """
                Welcome to The Final Fortress!
                Your Goal, to main as many horrid beasts as you can before you fall and your corpse joins them!
                Are you ready to face the trials ahead, even in spite of Certain Doom?????
                
                Input 'Y' for 'Yes I'm Very Ready to Die Gloriously in Battle!'
                Input 'N' if you're just here for the salad coupon.
                """;
        return ioHandler.getChar(intro);

    }

    private char gameIntroFail(IOHandler ioHandler) {
        String introFailLoop = """
                Oi! I'm on a tight schedule here.
                I can't exactly be affording to give you many special loops, so you only get one iteration from me!
                
                Input 'Y' to start the game.
                Input 'N' to back out.
                If you input anything else, you're just gonna see this message again!
                """;

        return ioHandler.getChar(introFailLoop);

    }

    private String gameAntiClimaxOutro() {
        return """
                Ah. Well, uh, okay.
                It's uh, a good thing this is a text console. Lemme just... get your coupon.
                Here: https://www.picknsave.com/savings/c/800000227710
                Welp. Have a good one I guess. Bye.
                """;
    }




    //==================================================
    //Test Stuff Below

//    private String getTestValue(IOHandler ioHandler) {
//        String prompt = "Testing Text Handler. Input something: ";
//        return ioHandler.getText(prompt);
//    }

}
