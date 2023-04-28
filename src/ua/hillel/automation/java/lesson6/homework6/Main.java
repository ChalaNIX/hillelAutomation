package ua.hillel.automation.java.lesson6.homework6;

public class Main {
    public static void main(String[] args) {
        CardStore cardStore = CardStore.getInstance();
        String[] deck = cardStore.getDeck();

        Player player1 = new Player("John");
        Player player2 = new Player("Rachel");
        Player player3 = new Player("Phibi");
        Player player4 = new Player("Chandler");



    }
}
