package ua.hillel.automation.java.lesson6.homework6;

public class Main {
    public static void main(String[] args) {
        CardStore cardStore = CardStore.getInstance();
        String[] deck = cardStore.getDeck();

        Player player1 = new Player("John");
        CardManager.getPlayers(player1);
        Player player2 = new Player("Monika");
        CardManager.getPlayers(player2);
        Player player3 = new Player("Chandler");
        CardManager.getPlayers(player3);
        Player player4 = new Player("Phib");
        CardManager.getPlayers(player4);


    }
}
