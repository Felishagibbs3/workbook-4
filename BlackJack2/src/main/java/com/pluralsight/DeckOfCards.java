package com.pluralsight;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;

public class DeckOfCards {
    List<DeckOfCards> cards;

    DeckOfCards(String suit, String rank) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        Hand hand1 = new Hand();
        cards = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = DeckOfCards.deal();
            // deal that card to the hand
            hand1.deal(card);
        shuffle();
    }

    void shuffle() {
        shuffle(cards);
    }

    DeckOfCards dealCard() {
        return cards.remove(0);
    }

}

    private static Card deal() {
    }
