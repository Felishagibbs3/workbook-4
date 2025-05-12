package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class CardGameMain {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number of players");
        int numberOfPlayers = myScanner.nextInt();
        ArrayList <Hand> players = new ArrayList<>();

        //create the deck
        Deck deck = new Deck();
        //create the hand
        Hand hand1 = new Hand();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }
}
