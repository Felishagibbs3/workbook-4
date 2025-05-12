package com.pluralsight;

public class SuperApp {
    public static void main(String[] args) {
        // make super person with constructor variables from super person class
        SuperPerson superPerson1 = new SuperPerson("Spiderman", 100);
        SuperPerson superPerson2 = new SuperPerson("Batman", 100);

        System.out.println(superPerson1.getStatus());
        System.out.println(superPerson2.getStatus());

        // action for super person to take damage
        superPerson1.takeDamage(20);
        superPerson2.takeDamage(15);

        // check status after taking damage
        System.out.println(superPerson1.getStatus());
        System.out.println(superPerson2.getStatus());

        //make the superpersons fight one another
        superPerson1.fight(superPerson2);
        superPerson2.fight(superPerson1);

        System.out.println(superPerson1.getStatus());
        System.out.println(superPerson2.getStatus());

    }
}
