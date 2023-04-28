package ua.hillel.automation.java.lesson6.homework6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardStore cardStore = new CardStore();
        CardManager cardManager = new CardManager(cardStore);

        Players player1 = new Players("John");
        Players player2 = new Players("Monika");
        Players player3 = new Players("Chandler");
        Players player4 = new Players("Phib");
        Players[] players = new Players[] {player1, player2, player3, player4};
        cardManager.serveCards(players);

        System.out.println(Arrays.toString(player1.getCards()));
    }
}
