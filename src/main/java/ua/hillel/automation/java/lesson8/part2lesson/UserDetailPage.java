package ua.hillel.automation.java.lesson8.part2lesson;

public class UserDetailPage extends BasePage{
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
    public UserDetailPage() {
        super(""); //виклик батьківського конструктора має йти першим
        //якщо в батьківському класі є параметри в конструкторі
        System.out.println("User's page created");
    }
}
