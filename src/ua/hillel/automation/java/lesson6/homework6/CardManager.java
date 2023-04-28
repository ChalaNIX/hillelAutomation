package ua.hillel.automation.java.lesson6.homework6;

public class CardManager {
    private CardStore cardStore;


    public CardManager(CardStore cardStore) {
        this.cardStore = cardStore;
    }


    public void serveCards(Players[] players) {
        String[] deck = CardStore.getDeck();
        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);
            for (int player = 1; player <= players.length; player++) {
                System.out.println("Player " + player + " gets: " + deck[index++]);
            }
            System.out.println("====================\n");
        }
    }
}
