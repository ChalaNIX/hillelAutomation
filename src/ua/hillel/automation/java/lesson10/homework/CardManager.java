package ua.hillel.automation.java.lesson10.homework;


public class CardManager {
    private CardStore cardStore;


    public CardManager(CardStore cardStore) {

        this.cardStore = cardStore;
    }

    public void serveCards(Players[] players) {
        String[] deck = CardStore.getDeck();
        int index = 0;
        try {
            for (int round = 1; round <= 5; round++) {
                System.out.println("Round: " + round);
                for (int player = 1; player <= players.length; player++) {
                    String card = deck[index++];
                    String[] playerCards = players[player-1].getCards();
                    playerCards[round-1] = card;
                    players[player-1].setCards(playerCards);
                    System.out.println("Player " + player + " gets: " + card);
                }
                System.out.println("====================\n");
            }
        }catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Players error");
        }

    }
}
