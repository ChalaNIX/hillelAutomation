package ua.hillel.automation.java.lesson6.homework6;

import java.util.Arrays;

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
