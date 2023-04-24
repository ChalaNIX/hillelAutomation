package ua.hillel.automation.java.lesson6.lessonmaterial;

public class AndroidPhone extends Phone{
    @Override
    void receiveCall(String num) {
        System.out.println("Receiving call to Android from " + num);
    }

    @Override
    void makeCall(String num) {
        System.out.println("Making call to Android from " + num);
    }

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
