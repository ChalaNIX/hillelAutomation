package ua.hillel.automation.java.lesson6.homework6;

import java.util.Random;

public class CardStore {
    public static final int NUMBER_OF_CARDS = 52;
    private static String[] deck = new String[NUMBER_OF_CARDS];

    public CardStore() {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[index++] = value + " of " + suit;
            }
        }
        Random random = new Random();
        for (int i=0; i<100; i++) {
            int in = random.nextInt(NUMBER_OF_CARDS);
            int out = random.nextInt(NUMBER_OF_CARDS);

            String tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;
        }
    }

}
