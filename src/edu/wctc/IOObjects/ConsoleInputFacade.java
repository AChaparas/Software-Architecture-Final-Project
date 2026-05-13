package edu.wctc.IOObjects;

import java.util.Scanner;

public class ConsoleInputFacade {

    private final Scanner keyboard = new Scanner(System.in);

    public String getText() {
        return keyboard.nextLine();
    }

    public String getTextPrompt(String prompt) {
        System.out.println(prompt);
        return getText();
    }

    public int getInt() {

        while (true) {

            try {
                return Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                //parsing failed
                System.out.println("Error: Input Must Be An Integer Value.");
            }

        }
    }

    public int getIntPrompt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public char getChar() {
        return keyboard.nextLine().toUpperCase().charAt(0);
    }

    public char getCharPrompt(String prompt) {
        System.out.println(prompt);
        return getChar();
    }

}
