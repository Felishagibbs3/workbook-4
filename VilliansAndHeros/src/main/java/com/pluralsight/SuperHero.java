package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson {
    // extended super person class + added constructor that matches super person class
    // the constructor is being called from attributes from super person class
    // the superHero is identical to super person at this time
    public SuperHero(String name, int health, int powerLevel) {
        super(name, health);
        // in the parent as default power level (XP) to 0
        // for superHero we want to have them pass in power level
        //will use it as XP
        this.experiencePoints = powerLevel;
        //let superHero tell the world he is now alive

        System.out.println(this.name + " " + "has arrived with a power level of " + powerLevel);

    }
    // the superHero wanted to learn how to fight better, so it overrides the skills


    public void fight(SuperPerson opponent, Random random) {
        int baseDamage = new Random().nextInt();
        int totalDamage = baseDamage + experiencePoints;

        if (baseDamage == 0) {
            System.out.println("You missed me" + opponent.name);
        } else {
            System.out.println(name + " " + "has attacked" + opponent.name);
            opponent.takeDamage(totalDamage);
        }

    }

}