package edu.wctc.PlayerObjects;

public abstract class Player {

    protected AttackBehaviour attackBehaviour;
    protected HealthBehaviour healthBehaviour;
    protected String playerName;

    public Player() {

    }

    public int getHealth() {

        return healthBehaviour.healthValue();

    }

    public int getArmor() {

        return healthBehaviour.armorValue();

    }

    public int getAttackValue() {

        return attackBehaviour.attack();

    }

    //Kinda hacky way to have the player gain Armor
    public void gainArmor(int armorAmount) {

        healthBehaviour.gainArmor(armorAmount);

    }

    //Extremely hacky way to make the player take damage from an attack
    public void takeDamage(int incomingDamage) {

        int remainingDamage = incomingDamage;

        /*
        We need to do damage calculation now. Hoo boy.
        I don't want the Armor value to go below 0, so I came up with this.
        Extremely tricky nested if/for loops, absolutely horrific I bet.
        For each point of incoming damage, it's first decremented from the active Armor count,
        Then any overflow is decremented from the Health count.
        It took a while to get working properly, but it does now so I'll take it
         */
        if (healthBehaviour.armorValue() > 0) {

            //First we damage the armor as much as we can
            for (int i = incomingDamage; i > 0 && healthBehaviour.armorValue() > 0; i--) {
                healthBehaviour.armorDamage();
                //We need to also keep count of how much damage'll be left to inflict after we're done with the armor
                remainingDamage--;

                System.out.println("TEST INFO - ARMOR DAMAGE TAKEN");
                System.out.println(healthBehaviour.armorValue());
                System.out.println("DAMAGE LEFT IS " + i);
                if (healthBehaviour.armorValue() == 0) {

                    for (i = remainingDamage; i > 0 && healthBehaviour.healthValue() > 0; i--) {
                        healthBehaviour.healthDamage();

                        System.out.println("TEST INFO - HEALTH DAMAGE TAKEN");
                        System.out.println(healthBehaviour.healthValue());
                        System.out.println("DAMAGE LEFT IS " + i);
                    }

                }

            }

        }

    }

}
