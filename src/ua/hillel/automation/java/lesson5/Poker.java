package ua.hillel.automation.java.lesson5;

import java.util.Random;

public class Poker {
    public static final int NUMBER_OF_CARDS = 52;
    public static final int NUMBER_OF_PLAYERS = 4;

    private static String[] deck = new String[NUMBER_OF_CARDS];

    public static void main(String[] args) {
        createDeck();
        shuffleDeck();
        serveCards();

    }
    private static void createDeck() {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[index++] = value + " of " + suit;
            }
        }
    }

    private static void shuffleDeck() {
        Random random = new Random();
        for (int i=0; i<100; i++) {
            int in = random.nextInt(NUMBER_OF_CARDS);
            int out = random.nextInt(NUMBER_OF_CARDS);

            String tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;
        }
    }

    private static void serveCards() {
        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);
            for (int player = 1; player <= NUMBER_OF_PLAYERS; player++) {
                System.out.println("Player " + player + " gets: " + deck[index++]);
            }
            System.out.println("====================\n");
        }
    }

}
