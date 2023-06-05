package ua.hillel.automation.java.lesson8;

public class OverrideEx {
    public static void main(String[] args) {
        //це об'єкт третього рівня успадкування (BasePage,UserPage,AdminPage)
        //тож по черзі викликаються 3 конструктори
        //працює для конструкторів без параметрів (параметр доданий в конструктор для наступного прикладу
        AdminDetailPage detailPage = new AdminDetailPage("admin");
        detailPage.openUserDetails();

        System.out.println();

        //перевантаження методу
        detailPage.openUserSetting("admin");

        System.out.println();

        detailPage.openUserSetting();
        //якщо ж у нас є параметр у батьківського конструктора, треба додати параметр в дочірній
        //та всередині дочірнього конструктора викликати батьківський конструктор з цим же
        //параметром
    }
}
