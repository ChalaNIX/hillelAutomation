package ua.hillel.automation.java.lesson6.lessonmaterial;
/*
Кожен клас що успадковується від абстрактного має реалізувати абстрактні методи основного класу
 */
public abstract class Phone implements Filming,Audioble{    //зазначаєм що клас абстрактний (має методи без імплементації)
    //implements - ключове слово для імплементації інтерфейсів
    protected String model;
    abstract void receiveCall(String num);
    abstract void makeCall(String num);  //абстрактний метод може бути без тіла
    public void receiveSms (String num, String text) {   //ці методи вже з доданою реалізацією бо не абстрактні мають мати реалізацію
        System.out.println("Receiving sms from number: " + num + " with text:\n" + text);
    }
    public void sendSms (String num, String text) {   //ці методи вже з доданою реалізацією
        enableGsmModule("ON");
        System.out.println("Sending sms to number:" + num + " with text:\n" + text);
        enableGsmModule("OFF");

    }
    //використовується методом sendSms без додаткових контсрукцій (хоч і private)
    private void enableGsmModule (String state) {
        System.out.println("Setting GSM to " + state);
    }
}
