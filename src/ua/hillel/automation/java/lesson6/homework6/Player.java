package ua.hillel.automation.java.lesson6.homework6;

public class Player {
    private String name;
    private String[] cards;

    public Player(String name) {
        this.name = name;
    }

    public String[] getCards() {
        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }
}
