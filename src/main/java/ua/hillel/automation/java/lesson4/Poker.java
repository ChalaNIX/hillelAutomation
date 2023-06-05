package ua.hillel.automation.java.lesson4;

import java.util.Random;

public class Poker {
    /*
    Написати програму, яка імітує роботу автомату з покеру, а саме роздає карти гравцям.
    За столом сидять 4 гравці, кожен з них отримує 5 карт. Карти не можуть повторюватися та йти одна за одною.
    Формат виводу на екран: "Гравець N отримує карту <НАЗВА КАРТИ>"
     */
    public static void main(String[] args) {
        String[] cards =   {"two clubs", "three clubs","four clubs", "five clubs", "six clubs", "seven clubs","eight clubs",
                "nine clubs","ten clubs", "jack clubs","queen clubs","king clubs", "ace clubs",
                "two diamonds", "three diamonds","four diamonds", "five diamonds","six diamonds", "seven diamonds","eight diamonds",
                "nine diamonds","ten diamonds", "jack diamonds","queen diamonds","king diamonds","ace diamonds",
                "two hearts", "three hearts","four hearts", "five hearts","six hearts", "seven hearts","eight hearts",
                "nine hearts","ten hearts", "jack hearts","queen hearts","king hearts","ace hearts",
                "two spades", "three spades","four spades", "five spades","six spades", "seven spades","eight spades",
                "nine spades","ten spades", "jack spades","queen spades","king hearts","ace spades"};
        //players and their cards
        int[][] playersCards = new int [4][5];
        //index of card in array
        int card = 0;

        Random random = new Random();
        //take card from array and put null on its place in array
        for (int i = 0; i < playersCards.length; i++) {
            for (int j = 0; j < playersCards[i].length; j++){
                do {
                    card = random.nextInt(cards.length);
                }
                while(cards[card]==null);
                System.out.println("Player " + (i+1) +" gets " + cards[card]);
                cards[card]=null;
            }
        }
    }
}
