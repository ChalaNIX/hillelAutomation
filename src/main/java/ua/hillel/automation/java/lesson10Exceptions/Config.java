package ua.hillel.automation.java.lesson10Exceptions;

import java.io.*;

public class Config {
    public String getConfigValue() throws IOException, InterruptedException { //throws Exception спосіб обійти помилку синтаксису не додаючи обробку exception
        //додати файл
        try{
            FileReader reader = new FileReader(new File("somefile")); //джава видає помилку якщо не додати ексепшн/throws....
            reader.read();
            Thread.sleep(1000); //різні потоки, і цей поток можуть розбудити - InterruptedException

        }catch (IOException | InterruptedException e) {  //одразу 2 ексепшена

        }
        return "";
    }

}
