package com.pluralsight;

public class Cards {
   private String suit;
   private String value;
   private boolean isFaceup;

    Cards(String suit, String rank) {
        this.suit = suit;
        this.value = value;
        this.isFaceup = false;
    }

    public int getValue() {
        return switch (value) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(this.value);
        };
    }

    public String toString() {
        return value + " of " + suit;

    }

}
