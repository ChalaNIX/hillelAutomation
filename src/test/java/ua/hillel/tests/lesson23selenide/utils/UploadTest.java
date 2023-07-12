package ua.hillel.tests.lesson23selenide.utils;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class UploadTest {

    @Test
    public void downloadTest() throws FileNotFoundException {
        File  file = $(".fileLink").download();
        TestDataStorage.saveTestData("file",file);
    }
    @Test
    public void uploadTest(){
        File file = (File) TestDataStorage.getTestData("file"); //TestDataStorage
        $(".upload").uploadFile(file.getAbsoluteFile());
    }
}
