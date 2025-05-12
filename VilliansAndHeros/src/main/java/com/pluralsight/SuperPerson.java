package com.pluralsight;

import java.util.Random;

public class SuperPerson {
    // subclasses can use "protected" (describes as genes or traits you get from your parents, keep it in the family)
    // protected properties so they can possibly be accessed by the children classes, etc.
    // describing what it takes to make a person and it's attributes that makes it a person

    protected String name;
    protected int health;
    protected int experiencePoints;

    public SuperPerson(String name, int health) {
        // using constructor to take in the values for name + health
        // default the XP to 0
        this.name = name;
        this.health = health;
        this.experiencePoints = 0;
    }

    public boolean isAlive() {
        // checking to see if character is alive
        // if health is above 0, return alive/true, otherwise false
        // return this is a simpler form without the if statement
        return (this.health > 0);

    } public void fight (SuperPerson opponent) {
        // creating a method for fighting + printing out who we are fighting
        int damageAmount = new Random().nextInt(20);
        System.out.println(this.name + " is fighting " + opponent.name);
        opponent.takeDamage(damageAmount + this.experiencePoints);
    }

    // takeDamage method allows for super person to take damage
    public void takeDamage(int damageAmount) {
        // subtract damage amount from health, but don't want to set health below 0
        this.health -= damageAmount;
        if(this.health <0){
            this.health = 0;
        }
    }
    public String getStatus(){
        // ask and show how the super person is doing and retrieve health status
        return this.name + " " + "has" + " " + this.health +  " " + "health left";
    }

}
