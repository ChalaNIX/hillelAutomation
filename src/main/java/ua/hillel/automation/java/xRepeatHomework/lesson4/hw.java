package ua.hillel.automation.java.xRepeatHomework.lesson4;

import java.util.Arrays;
import java.util.Random;

public class hw {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] intArray = new int[20];
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = random.nextInt(1,100);
//            if (intArray[i] % 2 == 0) {
//                intArray[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(intArray));
//        int sum = 0;
//        for (int i = 0; i<intArray.length; i++) {
//            sum+= intArray[i];
//        }
//        System.out.println("Average is " + sum / intArray.length);


        //cards
        String [] suits = {"Spades", "Hearts", "Diamonds","Clubs"}; //4
        String [] names = {"Ace","2","3","4","5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //13

        //formatting of deck

        String [] deck = new String[suits.length * names.length];

        int deckInteger = 0;
        for (int i = 0; i< names.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[deckInteger++] = names[i] + " of " +suits[j];
            }
        }
        System.out.println(Arrays.toString(deck));
        //getting every player 5 cards
        String [] players = {"FirstPlayer","SecondPlayer","ThirdPlayer", "ForthPlayer"};

        for (int i = 0; i< 5; i++) {

        }


    }
}
