package ua.hillel.automation.java.lesson6.idealhomework;
import java.util.Random;

public class PokerMachine {
    private int cardCount = 0;

    public CardDeck getNewCardDeck() {
        return new CardDeck();
    }

    public CardDeck shuffleDeck(CardDeck cardDeck) {
        Random random = new Random();
        for (int i=0; i<100; i++) {
            int in = random.nextInt(cardDeck.NO_OF_CARDS);
            int out = random.nextInt(cardDeck.NO_OF_CARDS);

            Card tmp = cardDeck.getCard(in);
            cardDeck.setCard(in, cardDeck.getCard(out));
            cardDeck.setCard(out, tmp);
        }
        return cardDeck;
    }

    public Card getNextCard(CardDeck cardDeck) {
        return cardDeck.getCard(cardCount++);
    }
}
