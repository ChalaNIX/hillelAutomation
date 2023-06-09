package ua.hillel.automation.java.lesson7;

import ua.hillel.automation.java.lesson6.lessonmaterial.Filming;
import ua.hillel.automation.java.lesson6.lessonmaterial.IPhone;
import ua.hillel.automation.java.lesson6.lessonmaterial2.Dog;

public class MethodLib {
    //спочатку рівень доступу,
    //повертаєме значення (void - нічого),
    //ім'я методу (з маленької, означати дію(якщо не повертає boolean -isSomething - isStatusActive))
    //параметри що приймає
    //тіло методу
    //access_mod return_type_ name (params)
    public void methodWithoutReturn() {

    }
    public int methodWithIntReturn() {

        return 0;
        //після return код не пишем
    }
    public Filming methodWthObject() {

        new IPhone().playMusic(); //звернення до об'єкту не створюючи його (бо нам потрібен 1 раз)
        return new IPhone();   //можна повертати об'єкт типу Filming
        //будь що що приймає форму інтерфейсу, може бути повернути в цьому методі
    }

    //варіанти переданих параметрів

    public void methodWithParams(String s, Integer i, boolean b) {
        System.out.println("String: " +s+ " Integer: "+i+ " Boolean: "+b);
    }

    //передача параметрів за значенням, і за посиланням

    public int convertInt(int i) {
        i = i + 10;
        return i;
    }

    public Dog updateDog(Dog dog) {
        dog.setAge(dog.getAge()+4);
        return dog;
    }
    public Dog updateDogWithoutChangingFirstDog(Dog dog) {
        Dog innerDog = new Dog();
        innerDog.setName(dog.getName());
        innerDog.setColor(dog.getColor());
        innerDog.setAge(dog.getAge() + 2);
        return innerDog;
    }

    //не обов'язковий аргумент, має стояти в кінці
    public void createProducts(String... products) {
        System.out.println(products[0]);
        System.out.println(products[1]);
        System.out.println(products[2]);
    }


    public void methodWithVarArg(int i, int...ints) {
        System.out.println(i);
        for (int num: ints) {
            System.out.println(num);
        }

    }
    //перевантаження методів
    public void giveDiscount(int discount) {

    }

    public void giveDiscount(double discount) {
        giveDiscount("", 5);

    }
    public void giveDiscount(String product, double discount) {

    }
    //перевикористання методів (можливо в рамках одного класу)
    public void createProduct(String product) {
        createProduct(product, 0);
    }
    public void createProduct(String product, double discount) {
        //product creation
        if(discount > 0) {
            //add discount
        }
    }

















}
