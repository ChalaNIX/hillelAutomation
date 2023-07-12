package ua.hillel.tests.lesson23selenide;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class UploadTest {
    File file;
    @Test
    public void downloadTest() throws FileNotFoundException {
        file = $(".fileLink").download();
    }
    public void uploadTest(){
        $(".upload").uploadFile(file.getAbsoluteFile());
    }
}
