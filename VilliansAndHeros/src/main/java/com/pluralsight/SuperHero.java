package com.pluralsight;

public class SuperHero extends SuperPerson {
// extended super person class + added constructor that matches super person class
    // the constructor is being called from attributes from super person class
    // the superHero is identical to super person at this time
    public SuperHero(String name, int health) {
        super(name, health);
    }
}
