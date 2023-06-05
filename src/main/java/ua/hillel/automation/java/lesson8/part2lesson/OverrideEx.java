package ua.hillel.automation.java.lesson8.part2lesson;

public class OverrideEx {
    public static void main(String[] args) {
        //це об'єкт третього рівня успадкування (BasePage,UserPage,AdminPage)
        //тож по черзі викликаються 3 конструктори
        System.out.println("Constructors:");
        AdminDetailPage detailPage = new AdminDetailPage("111");
        System.out.println("Method of User Details without params");
        detailPage.openUserDetails();

        System.out.println();

        System.out.println("Method of User Details with params:");
        //перевантаження методу
        detailPage.openUserSetting("admin");

        detailPage.openUserSetting();
        //final-закритий для зміни(константа), static
        //присвоїти значення полю класа (з final не працює):
        new Finals("").averageFIeld = "";
        System.out.println("Status:");
        //присвоїти статус з фінальної змінної (за посиланням):
        Finals finals = new Finals("");
        //finals.setStatus(new Statuses().IN_PROGRESS); //це для не статичних полів
        finals.setStatus(Statuses.IN_PROGRESS); //це для статичних полів
        //static
        //якщо є сумніви чи писати static - краще не писати
        //все що помічено static відноситься не до конкретного об'єкту а до всього класу взагалі
        //тобто щоб звернутись до поля/методу нам не потрібно створювати об'єкт такого типу

        //enum
        //для переліку (випадаючих списків-дропдаунів)
        //тепер в метод можна передати обмежений перелік значень (менша вірогідність помилок)
        finals.setStatusEnum(Status.DONE);
    }
}
