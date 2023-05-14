package ua.hillel.automation.java.lesson10Exceptions;

import java.io.IOException;

public class ExceptionPage {
    public void getValueFromConfig() throws Exception /*throws IOException, InterruptedException*/ { //спосіб обійти помилку синтаксису не додаючи обробку exception
    try {
        new Config().getConfigValue();
    } catch(IOException e) {                    //можна обробляти скільки завгодно виключень, навіть ті що не можуть статися
        e.printStackTrace();                       //використовують щоб вивести на екран деталі помилки
        throw new Exception("Something went wrong"); //в catch ієрархія - від більше конкретних до загальних exceptions
        //System.out.println("IO Exception");
    } catch (InterruptedException ie) {
        System.out.println("Interrupted Exception");
    }

    }
}
