package ua.hillel.automation.java.lesson8.part2lesson;
//весь класс може бути final. в нього не може бути дочірніх класів
//і всі методі фінальні в нього
public final class ChildClassForFinals extends Finals{
    //конструктор
    public ChildClassForFinals() {
        super("");
    }
//метод в Finals помічений як final тому його можна тільки перевантажити, не можна переписати
    public void finalMethod(String newVar){

    }
}
