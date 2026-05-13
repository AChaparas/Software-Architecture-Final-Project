package edu.wctc.IOObjects;

public interface IOHandler {

    int getInt(String prompt);
    String getText(String prompt);
    char getChar(String prompt);
    void outputText(String text);

    static IOHandler getInstance() {
        return null;
    }

}
