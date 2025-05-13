package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class SuperApp {
    public static void main(String[] args) throws InterruptedException {
        // make super person with constructor variables from super person class
        SuperVillian mojoJoJo = new SuperVillian("Mojo JoJo", 100, 40);
        SuperHero superMan = new SuperHero("SuperMan", 100, 20);

        Random random = new Random();
        // character's attributes
        Scanner fighters = new Scanner(System.in);
        String character1 = "SuperMan";
        String character2 = "Mojo Jojo";
        int superManHealth = 100;
        int mojoJojoHealth = 100;

        // loading screen display
        System.out.println("=======================================");
        System.out.println("     BATTLE OF THE UNIVERSE!");
        System.out.println("========================================");
        System.out.println();
        System.out.println(character1 + " " + "VS" + " " + character2);
        System.out.println();
        System.out.println(character1 + " - Starting Health: " + superManHealth);
        System.out.println(character2 + " - Starting Health: " + mojoJojoHealth);
        System.out.println();
        System.out.println("Are You Ready for the BATTLE OF THE UNIVERSE?!");
        System.out.println("Ready Player 1? Hit 'Enter' to FIGHT!");
        System.out.println("Ready Player 2? Hit 'Enter' to FIGHT!");
        fighters.nextLine();


        // > greater than < less than
        // if 1 is less than or equal to 2, they'll attack once and add up to equal 2 then stop

        for (int round = 1; mojoJojoHealth > 0; round++) {
            System.out.println("Mojo JoJo turns and attacks SuperMan with a kick");
            superMan.takeDamage(15);

         break;   // Batman successfully attacked SpiderMan twice, subtracting 15 from SpiderMan
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

            for (int i4 = 5; i4 >4;) {
                superMan.takeDamage(40);
                System.out.println("Superman gets blasted with a ray blast");
                break;
            }
            System.out.println(superMan.getStatus());
            System.out.println("Superman stands up..");

            for (int i5 = 100; i5 >25;){
                mojoJoJo.takeDamage(25);
                System.out.println("Superman FINISHES Mojo Jo with a Solar Flare");
                break;
            }
            System.out.println(mojoJoJo.getStatus());
            System.out.println("=======================================");
            System.out.println("     SUPERMAN HAS SAVED US!");
            System.out.println("=======================================");
        }
        // check status after taking damage


        //make the super persons fight one another

    }
}
