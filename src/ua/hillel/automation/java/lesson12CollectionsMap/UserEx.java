package ua.hillel.automation.java.lesson12CollectionsMap;

import java.util.HashMap;
import java.util.Map;

public class UserEx {
    public static void main(String[] args) {
        //створюємо юзера
        User user = new User();
        user.setName("John Snow");
        user.setAge(10);
        System.out.println("Firsts value: "+user.hashCode());

        //додаємо юзера в мапу
        Map<User, String> userMap = new HashMap<>();
        userMap.put(user,"the wall");

        //апдейтим юзера
        user.setId(1);
        user.setAge(20);
        System.out.println("Second value: "+user.hashCode()); //хешкоди різні бо ми змінювали наш об'єкт


        System.out.println(userMap.get(user)); //null бо ми міняли об'єкт
        System.out.println(userMap);  //хоча всі поля збережені


    }
}
