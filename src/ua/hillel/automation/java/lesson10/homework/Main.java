package ua.hillel.automation.java.lesson10.homework;

//import ua.hillel.automation.java.lesson6.homework6.CardManager;
//import ua.hillel.automation.java.lesson6.homework6.CardStore;
//import ua.hillel.automation.java.lesson6.homework6.Players;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardStore cardStore = new CardStore(); //створюєм колоду карт і міксуєм
        CardManager cardManager = new CardManager(cardStore); //приймаем колоду карт

        Players player1 = new Players("John");
        Players player2 = new Players("Monika");
        Players player3 = new Players("Chandler");
        Players player4 = new Players("Phib");
        Players[] players = new Players[] {player1, player2, player3, player4};
        cardManager.serveCards(players);

        System.out.println(Arrays.toString(player1.getCards()));
    }
}
