package ua.hillel.automation.java.lesson10Exceptions;
//Stack trace - вивід ексепшена в консолі, зліпок ланцюжку методів, в яких виникла помилка (можна клікнути)

public class ExceptionEx {
    public static void main(String[] args) throws Exception { //спосіб обійти помилку синтаксису не додаючи обробку exception
        //new ExceptionTest().exceptionTest();
        int index = 10;
        int [] array = {1,2,4};

        try{
            System.out.println("START TRY");
            System.out.println(array[index]);
            System.out.println("END TRY");

        } catch (Exception e) {                      //блок catch необов'язковий якщо є блок finally
            System.out.println("INSIDE CATCH");
        } finally {                                   //блок finally виконується завжди
            System.out.println("INSIDE FINALLY");
        }

        System.out.println("AFTER TRY_CATCH");


    }
}
