package edu.wctc.GameObjects;

import edu.wctc.PlayerObjects.Player;
import edu.wctc.EnemyObjects.Enemy;
import edu.wctc.IOObjects.IOHandler;

public class CombatCore {

    public void combatStart(Player playerCharacter, Enemy attackingEnemy, IOHandler ioHandler) {

        char playerCharChoice;

        ioHandler.outputText("An Enemy Approaches! Looks like it's a " + attackingEnemy.getEnemyName() +"!");

        //Loop runs while both Player and Enemy entities are alive
        while (playerCharacter.getHealth() > 0 && attackingEnemy.getHealth() > 0) {

            //Start by having player choose to Attack or Defend
            playerCharChoice = combatChoicer(ioHandler, playerCharacter);

            //See if they're gonna attack or defend
            if (playerCharChoice != 'A' && playerCharChoice != 'D') {

                //If they don't play along, make them
                do {

                    playerCharChoice = combatChoicerTryAgain(ioHandler);

                } while (playerCharChoice != 'A' && playerCharChoice != 'D');

            }

            //Loop only continues if they've attacked or defended, we only really need to check one.
            if (playerCharChoice == 'A'){

                //Player has chosen to Attack, deal Attacking Damage to Enemy.
                attackingEnemy.enemyTakeDamage(playerCharacter.getAttackValue(), attackingEnemy.getHealthBehaviour());
                ioHandler.outputText("You attack the Enemy!\nYou dealt " + playerCharacter.getAttackValue() + " damage!");

            } else {

                //Player has chosen to Defend, raise Armor Value.
                playerCharacter.gainArmor(playerCharacter.getArmor());
                ioHandler.outputText("You raised your defenses! Your armor is now at " +playerCharacter.getArmor() + ".");

            }

            //Player action has been taken, Enemy Turn.
            //Enemies are very simplistic and do not have the ability to gain armor.
                //* although they theoretically could, but this is all arbitrary
            //So all the enemy does is attack.
            //First though we check if it's dead or not, because if it is then we skip its attack phase.

            if (attackingEnemy.getHealth() > 0) {

                playerCharacter.takeDamage(attackingEnemy.getAttackValue(), playerCharacter.getHealthBehaviour());
                ioHandler.outputText("The enemy attacks! You were dealt " + attackingEnemy.getAttackValue() + " damage!");

            } else {

                playerCharacter.addToScore(attackingEnemy.getScoreValue());
                ioHandler.outputText("The enemy was slain! You gained " + attackingEnemy.getScoreValue() + " points!");

                //Test Values
//                System.out.println("TEST INFO - PLAYER SCORE GAINED");
//                System.out.println("PLAYER SCORE IS " +playerCharacter.getScore());

            }


        }

    }

    private char combatChoicer(IOHandler ioHandler, Player playerCharacter) {

        String combatDialogue = "It's your turn! You have " + playerCharacter.getHealth() +"HP.\nWhat will you do: [A]ttack or [D]efend?";

        return ioHandler.getChar(combatDialogue);

    }

    private char combatChoicerTryAgain(IOHandler ioHandler) {

        String combatDialogue = "You have to act quick!\n[A]ttack or [D]efend?";

        return ioHandler.getChar(combatDialogue);

    }

}
