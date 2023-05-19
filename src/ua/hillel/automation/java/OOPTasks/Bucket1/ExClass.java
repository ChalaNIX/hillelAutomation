package ua.hillel.automation.java.OOPTasks.Bucket1;

public class ExClass {
    public static void main(String[] args) {
        Good goods0 = new Good("potato",20);
        Good goods1 = new Good("tomato",4510);
        Good goods2 = new Good("avocado",2.05);
        Good goods3 = new Good("gelato",115);
        Good goods4 = new Good("momento",16.90);

        Bucket bucket = new Bucket();
        bucket.addGoods(goods0);
        bucket.addGoods(goods1);
        bucket.addGoods(goods2);
        bucket.addGoods(goods3);
        bucket.addGoods(goods4);
        System.out.println(bucket.getQuantity());
        bucket.deleteGoods(goods0);
        System.out.println(bucket.getQuantity());
        System.out.println(bucket.getTotalPrice());


    }
}
