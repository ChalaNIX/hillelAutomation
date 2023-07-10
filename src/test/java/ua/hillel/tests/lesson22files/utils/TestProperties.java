package ua.hillel.tests.lesson22files.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


//не можна отримати доступ в main частині з test частини проєкту. тому main не матиме доступу до файлу properties
public class TestProperties {
    private static Properties properties;
    private TestProperties(){} //щоб не можна проініціалізувати
    public static String getProperty(String propName) throws IOException {
        if(properties==null) {
            properties = new Properties();
            properties.load(new FileReader(new File("src/test/resources/test.properties")));
        }

        return properties.getProperty(propName);
    }
}
