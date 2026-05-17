package edu.wctc.IOObjects;

import java.util.Random;

//Technically this being IOConsole leaves room for stuff like Web and Java Applet interfaces.
//I don't know how to do that though so it's by itself.
public class IOConsole implements IOHandler {

    //Singleton method implementation as shown in-class
    private static IOConsole instance = new IOConsole();
    private static ConsoleInputFacade console = new ConsoleInputFacade();

    private IOConsole() {
        instance = this;
    }

    public static IOHandler getInstance() {
        return instance;
    }

    //=============================================================

    //Methods implemented from IOHandler, filled in from ConsoleInputFacade

    //Outputs text to Console window
    @Override
    public void outputText(String text) {

        System.out.println(text);

    }

    //Receives Int from User Input and returns it
    @Override
    public int getInt(String prompt) {

        return console.getIntPrompt(prompt);

    }

    //Receives Text from User Input and returns it
    @Override
    public String getText(String prompt) {

        return console.getTextPrompt(prompt);

    }

    //Receives Text from User Input and returns first char value
    @Override
    public char getChar(String prompt) {

        return console.getCharPrompt(prompt);

    }

    //Inclusive Random Number Generator
    //Will generate number within given range including the min and max values
    @Override
    public int getRandomNumber(int min, int max) {

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }

}
