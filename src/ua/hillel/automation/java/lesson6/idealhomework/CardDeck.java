package ua.hillel.automation.java.lesson6.idealhomework;

public class CardDeck {
    public static final int NO_OF_CARDS = 52;
    private Card[] deck = new Card[NO_OF_CARDS];

    public CardDeck() {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int count=0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count++] = new Card(suite, value);
            }
        }
    }

    public Card getCard(int num) {
        return deck[num];
    }

    public void setCard(int num, Card card) {
        deck[num] = card;
    }
}
