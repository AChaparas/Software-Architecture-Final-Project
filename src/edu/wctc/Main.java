package edu.wctc;

import edu.wctc.BehaviourObjects.AttackValueBroker;
import edu.wctc.IOObjects.IOConsole;

public class Main {

    /*
    FINAL PROJECT OUTLINE

    Must Implement:
    -SOLID Principles
        -Single Responsibility
        -Open-Closed
        -Liskov Substitution
        -Interface Segregation
        -Dependency Inversion
    -Strategy Pattern
    -Singleton Pattern
    -At Least One Factory Method
    -JUnit
    -10 Bonus Points: An Additional Pattern

     */

    /*

    WHAT TO DO FOR GAME:
    Has to be some kind of interactive game according to Matt

    Main should probably call a Game object, which should run its primary method using an IOHandler object

     */

    public static void main(String[] args) {
        new GameCore().gameStart(IOConsole.getInstance());
    }

}
