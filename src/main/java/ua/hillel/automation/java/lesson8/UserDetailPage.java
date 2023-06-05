package ua.hillel.automation.java.lesson8;

public class UserDetailPage extends BasePage {
    //Кожен дочірній клас знає про свій батьківський.
    //Ми можемо отримати посилання на нього, щоб звернутись до батьківського класу - за допомогою об'єкту super
    //Таким чином можна показати різницю доступів звичайного користувача і адміна на сторінці User Details

    public void openUserDetails() {
        System.out.println("User's Details Page");
    }

    public void openUserSetting() {
        System.out.println("User's Settings");

    }
    //конструктор
    public UserDetailPage(String userParam) {
        //в конструкторі дочірнього класу з параметром обов'язково викликається батьківський
        //конструктор з цим же параметром
        super(userParam);
        System.out.println("User's page created");
    }
}
