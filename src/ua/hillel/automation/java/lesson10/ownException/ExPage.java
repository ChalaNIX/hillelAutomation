package ua.hillel.automation.java.lesson10.ownException;

import ua.hillel.automation.java.lesson10.Config;
import ua.hillel.automation.java.lesson10.ownException.ButtonNotFoundException;

import java.io.IOException;

public class ExPage {
    public void getValueFromConfig() throws Exception  {
            try {
                new Config().getConfigValue();
            } catch(Exception f) {
                throw new ButtonNotFoundException("Create new product","//[@class='new-product']");
                //throw new RuntimeException("button not found"); //другий варіант (менш детальний)
            }

    }

}
