package edu.wctc;

import java.util.InputMismatchException;
import java.util.Scanner;

//Technically this being IOConsole leaves room for stuff like Web and Java Applet interfaces.
//I don't know how to do that though so it's by itself.
public class IOConsole implements IOHandler{

    //Singleton method implementation as shown in-class
    private static IOConsole instance = new IOConsole();

    private IOConsole() {
        instance = this;
    }

    public static IOHandler getInstance() {
        return instance;
    }

    //=============================================================

    //Methods implemented from IOHandler

    //Outputs text to Console window
    @Override
    public void outputText(String text) {
        System.out.println(text);
    }

    //Receives Int from User Input and returns it
    @Override
    public int getInt(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        System.out.print(prompt);
        while (true) {
            try {
                number = Integer.parseInt(keyboard.nextLine());
                break; //input is valid, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please input an Integer.");
            }
        }
        return number;
    }

    //Receives Text from User Input and returns it
    @Override
    public String getText(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(prompt);
        return keyboard.nextLine();
    }

    //Receives Text from User Input and returns first char value
    @Override
    public char getChar(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(prompt);
        return keyboard.nextLine().toUpperCase().charAt(0);
    }

}
