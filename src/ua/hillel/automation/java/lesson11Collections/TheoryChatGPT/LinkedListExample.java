package ua.hillel.automation.java.lesson11Collections.TheoryChatGPT;

import java.util.LinkedList;

//LinkedList - це також реалізація інтерфейсу List, але на відміну від ArrayList,
// вона зберігає дані в зв’язаних між собою вузлах. Це означає,
// що для доступу до даних потрібно перебирати всі вузли від початку списку до потрібного елемента.
// Проте, якщо потрібно часто вставляти або видаляти елементи в середині списку,
// LinkedList може бути більш ефективною вибіркою порівняно з ArrayList.
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        System.out.println(linkedList); // [One, Two, Three]

        linkedList.addFirst("Zero");

        System.out.println(linkedList); // [Zero, One, Two, Three]

        linkedList.removeLast();

        System.out.println(linkedList); // [Zero, One, Two]
    }



}
