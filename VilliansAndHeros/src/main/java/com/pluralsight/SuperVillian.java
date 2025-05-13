package com.pluralsight;

import java.util.Random;

public class SuperVillian extends SuperPerson{

    public SuperVillian(String name, int health, int masterMindLevel) {
        super(name, health);
        this.experiencePoints = masterMindLevel;
        System.out.println(this.name + " " + "has spawned into the world with a Master Mind Level of  " + masterMindLevel);

    }
    public void fight(SuperHero opponent){
        int baseDamage = new Random().nextInt();
        int totalDamage = baseDamage + experiencePoints;

        if (baseDamage == 0) {
            System.out.println("Gotta be quicker than that" + " " + opponent.name);
        } else {
            System.out.println(name + " " + "super punched" + opponent.name);
        }
    }
}



// Create a hero object with a name, health, and powerLevel
// Create a villain object with a name, health, and evilness

// Display an introduction message
// Show the starting status of both characters

// Loop while both the hero and villain are still alive
// Indicate the hero's turn
// Have the hero fight the villain
// Show the villain's updated status

// If the villain is no longer alive, break the loop

// Indicate the villain's turn
// Have the villain fight the hero
// Show the hero's updated status
// End of loop

// Display a message that the battle is over

// If the hero is still alive
// Announce the hero as the winner
// Otherwise
// Announce the villain as the winner