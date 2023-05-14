package ua.hillel.automation.java.lesson10.homework;

public class Players {
    private String name;
    private String[] cards = new String[5];

    public Players(String name) {

        this.name = name;
    }

    public String[] getCards() {

        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;

    }


}
