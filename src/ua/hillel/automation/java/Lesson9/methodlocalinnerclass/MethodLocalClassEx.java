package ua.hillel.automation.java.Lesson9.methodlocalinnerclass;


//method-local inner class - створюються всередині методів. всі змінні методу доступні лише всередині методу
//тож вміст method-local inner class (класу всередині методу) буде доступний лише всередині цього методу

//невідомо де їх можна використати

public class MethodLocalClassEx {
    public void method1() {
        class MethodLocalClass {
            String f1,f2,f3;
        }
        MethodLocalClass methodLocalClass = new MethodLocalClass();
        System.out.println(methodLocalClass.f1);
    }
    public void method2() {
        //MethodLocalClass methodLocalClass = new MethodLocalClass();   - буде помилкою бо немає доступу до класу MethodLocalClass
        //за межами методу method1()
    }
}
