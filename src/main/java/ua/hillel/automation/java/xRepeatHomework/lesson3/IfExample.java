package ua.hillel.automation.java.xRepeatHomework.lesson3;

public class IfExample {
    public static void main(String[] args) {
        boolean flag = false;
        boolean b1 = true;
        boolean b2 = false;

        if(flag && b2 || b1) {
            System.out.println("Inside if");
        }
        String s = "Hello, Java";
        if (s != null && s.contains("Java")) {
            System.out.println("Bye, Java");
        }
    }
}
