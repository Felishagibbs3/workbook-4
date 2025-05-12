package com.pluralsight;

import java.util.Random;

public class SuperApp {
    public static void main(String[] args) {
        // make super person with constructor variables from super person class
        SuperVillian mojoJoJo = new SuperVillian("Mojo JoJo", 100, 40);
        SuperHero superMan = new SuperHero("SuperMan", 100, 20);

        Random random = new Random();
        // > greater than < less than
        // if 1 is less than or equal to 2, they'll attack once and add up to equal 2 then stop

        for (int i = 1; i <= 2; i++) {
            System.out.println("Mojo JoJo turns and attacks SuperMan");
            superMan.takeDamage(15);

            // Batman successfully attacked SpiderMan twice, subtracting 15 from SpiderMan
        }


        System.out.println(mojoJoJo.getStatus());
        System.out.println(superMan.getStatus());

        // action for super person to take damage
        for (int i = 1; i == 1; i++) {
            System.out.println("Superman turns and attacks Mojo Jojo with uppercut");
            mojoJoJo.takeDamage(15);

            System.out.println(mojoJoJo.getStatus());

            for (int i2 = 1; i2 <4;){
                System.out.println("Mojo JoJo tried to blast SuperMan, but missed");
                break;
            }
            for (int i3 = 4; i3 >3;) {
                mojoJoJo.takeDamage(60);
                System.out.println("SuperMan lifts and super slams Mojo JoJo to the ground");
                break;
            }
            System.out.println(mojoJoJo.getStatus());
        }
        // check status after taking damage


        //make the super persons fight one another

    }
}
