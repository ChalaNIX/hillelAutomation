package ua.hillel.automation.java.lesson10;

import java.io.*;

public class Config {
    public String getConfigValue() throws IOException, InterruptedException { //throws Exception спосіб обійти помилку синтаксису не додаючи обробку exception
        //додати файл
        FileReader reader = new FileReader(new File("somefile")); //джава видає помилку якщо не додати ексепшн/throws....
        reader.read();
        Thread.sleep(1000); //різні потоки, і цей поток можуть розбудити - InterruptedException
        return "";
    }

}
