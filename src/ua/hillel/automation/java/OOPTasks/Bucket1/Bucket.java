package ua.hillel.automation.java.OOPTasks.Bucket1;

import java.util.ArrayList;
import java.util.Objects;

public class Bucket {

    ArrayList<Good> goods = new ArrayList<>();

    public void addGoods(Good goods) {
        this.goods.add(goods);
    }
    public void deleteGoods(Good goods) {
        this.goods.remove(goods);
    }
    public int getQuantity() {
        return this.goods.size();
    }
    public double getTotalPrice() {
        double sum=0;
        for (Good good: goods) {
            sum+=good.getPrice();
        }
        //second variant
//        for (int i = 0; i < goods.size(); i++) {
//            sum+=goods.get(i).getPrice();
//        }
        return sum;
    }

}
