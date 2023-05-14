package ua.hillel.automation.java.lesson6.idealhomework;

public class Game {
    public static void main(String[] args) {
        PokerMachine pokerMachine = new PokerMachine();
        CardDeck deck = pokerMachine.getNewCardDeck();
        deck = pokerMachine.shuffleDeck(deck);

        for (int round=1; round <= 5; round++) {
            System.out.printf("***** Round %d *****%n", round);
            for (int player = 1; player<=4; player++) {
                System.out.printf("Player %d gets card: %s%n", player, pokerMachine.getNextCard(deck));
            }
            System.out.println();
        }
    }
}
