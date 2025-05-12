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
