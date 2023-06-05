package ua.hillel.automation.java.lesson12CollectionsMap.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;



//Створити програму - список покупок. В список заносяться назва товару та кількість.
//Список заповнити випадковими товарами. В кінці потрібно підрахувати загальну кількість всіх доданих товарів
public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Random random = new Random();
        int sum = 0;
        shoppingList.put("Tomato",0);
        shoppingList.put("Potato",0);
        shoppingList.put("Chicken",0);
        shoppingList.put("Dragon",0);
        shoppingList.put("Pumpkin",0);
        for (Map.Entry<String, Integer> set : shoppingList.entrySet()) {
            set.setValue(random.nextInt(1,10));
            System.out.println(set.getKey() + " = "
                    + set.getValue());
            sum +=set.getValue();
        }
        System.out.println();
        System.out.println("Sum is: "+sum);
    }
}
