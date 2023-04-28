package ua.hillel.automation.java.lesson6.homework6;

public class CardManager {
    private CardStore cardStore;
    public static final int NUMBER_OF_PLAYERS = 4;

    private String[]  ServeCards() {

        String [] arr = new String[4];
        return arr;
    }
    public void serveCards(String[] deck) {
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
