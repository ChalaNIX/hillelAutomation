package ua.hillel.automation.java.lesson6.lessonmaterial2;

import java.util.Objects;

public class Dog {
    /*
    Конструктор - спеціальний метод, що описує процес створення об'єктів
    Конструктор викликається, коли створюється об'єкт класу.
    Його можна використовувати для встановлення початкових значень для атрибутів об’єкта

    Навіть якщо ми не створювали, у класу все одно є контруктор, який джава додає автоматично


    Принципи ООП:
    1. Абстракція - це здатність виокремити найголовніші хар-ки що описують об'єкт
    2. Інкапсуляція - це здатність системи (класів) приховувати певну інфо і надавати доступ тільки до
    основних полів (методів). Реалізується за допомогою модифікаторів доступу для полей: private, protected, public
    public - з будь якого місця програми можна звернутись
    private - тільки з цього ж класу можна отримати доступ. щоб можна бути перед set value робити додаткові перевірки
    protected - доступ з цього класу і його дочірніх класів
    в рамках пакету - застарілий, без додаткового слова
    3. Поліморфізм - це здатність об'єктів приймати різну форму, але за умови якщо в них є один
    батьківський клас (андроід/айфон в прикладі мають різні свої методи)
    4. Успадкування - це здатність розширювати, доповнювати/змінювати існуючий функціонал у класах,
    що успадковуються від основного
     */
    private String color;   //приховані поля класу - доступ тільки всередині класу
    //доступ за допомогою гетерів та сетерів - get/set
    //додаються автоматично: Alt+insert
    //Класи, які містять тільки поля та гетери та сетери для доступу до них називаються POJO класи (Plain Old Java Object)
    private String name;
    private int age;
    //службове поле, яке ми створили щоб показати що не всі поля можна використовувати для перезапису методу Equals
    private String createDate;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//перевірка перед встановленням віку - для цього і роблять поля private/protected
    public void setAge(int age) {
        if (age < 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    @Override
    //@Override - це аннотація, певні вказівки, не несуть певного функціоналу. Хоча важливі для тестів
    //Тут @Override означає що в батьківському класі є точно такий метод (в дефолтному класі Object)
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, age);
    }

    public void sayWoof() {
        System.out.println(name + " says Woof");
    }
}
