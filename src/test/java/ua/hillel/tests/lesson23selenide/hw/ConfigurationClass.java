package ua.hillel.tests.lesson23selenide.hw;

import com.codeborne.selenide.Configuration;


public class ConfigurationClass {
    public ConfigurationClass() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.timeout =10000;
        Configuration.savePageSource= false;

        Configuration.reportsFolder = "target/reports";
        Configuration.downloadsFolder ="target/downloads";

    }
}
