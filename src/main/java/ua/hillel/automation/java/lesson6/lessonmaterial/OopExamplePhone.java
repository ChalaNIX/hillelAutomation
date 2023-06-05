package ua.hillel.automation.java.lesson6.lessonmaterial;

public class OopExamplePhone {
    /*
    Інтерфейси описують властивості того чи іншого об'єкту. Можуть успадковувати безліч
     */
    public static void main(String[] args) {
        AndroidPhone phone1 = new AndroidPhone();
        phone1.makeCall("+3804634563");
        phone1.receiveSms("+3804365346","hello");


        Phone phone2;
        String choice = "android";
        switch (choice) {
            case "android" :
                phone2 = new AndroidPhone();
                phone2.sendSms("+52345235", "Bye");   //?не можу використати зовні switch бо phone2 там невизначений
                break;
            case "iphone":
                phone2 = new IPhone();
                break;
        }

        Filming filming = new Camera(); //тут будуть доступні тільки методі інтерфейсу Filming
        // батьківський клас нічого не знає про методи своїх нащадків

        Filming filming1 = new AndroidPhone(); //об'єкт будь якого класу що імплементує інтерфейс Filming
        //тут будуть доступні тільки методи інтерфейсу



    }
}
