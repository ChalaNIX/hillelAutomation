package ua.hillel.automation.java.lesson8.part2lesson;

public class AdminDetailPage extends UserDetailPage {

    //створення у дочірньому класі такого ж методу буде заміщенням методу
    //ми можемо додати слово super для розширення і розширити батьківський метод
    public void openUserDetails() {
        //super може звертатися до всіх не приватних методів свого батьківського класу
        //super надає доступ до конструкторів батьківського класу
        //конструктори викликаються по ланцюжку від батьківського до дочірнього класу
        super.openUserDetails();
        System.out.println("Admin's Details Page");

    }
    //можна такой перевантажувати методи
    public void openUserSetting(String role) {
        System.out.println("Admin's Settings");

    }
    //конструктор
    public AdminDetailPage(String adminParam) {
        if(param.contains("111")) {
            System.out.println("111");
        }
        System.out.println("Admin's Page created");
    }
}
