package ua.hillel.automation.java.lesson6.lessonmaterial;
/*
Основа об'єктно -орієнтованої мови програмування - класи.
Клас - контейнер для зберігання коду, який описує новий тип даних і виступає в ролі шаблону для
об'єктів.
Назва класів - з великої літери кожне слово. Ніяких спец символів і нижніх підчеркувань.
 */
public class IPhone extends Phone{   //успадковує/розширює клас Phone. можна успадковуватись лише від одного класу

    //Ctrl + i (методи які мають бути імплементовані)

    @Override
    void receiveCall(String num) {
        System.out.println("Receiving call to IPhone from " + num);
    }

    @Override
    void makeCall(String num) {
        System.out.println("Making call from IPhone to " + num);
    }
    //ctrl + i для реалізації методів інтерфейсів
    @Override
    public void playMusic() {

    }

    @Override
    public void playPodcast() {

    }

    @Override
    public void makeVideo() {

    }
}

