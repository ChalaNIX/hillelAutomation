package ua.hillel.automation.java.files22;
//файл - це ресурс який знаходиться в файловій системі (на диску)
//файл теж можна описати як об'єкт з класу файл
//File знаходиться в стандартній бібліотеці, не треба підключати щось стороннє

//всі рідери і райтери - це ресурси, які треба закривати потім

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FilesEx {
    public static void main(String[] args) throws IOException {
        //програмне відображення реального файлу
        File file2 = new File("file2.txt"); //абсолютний або відносний шлях (відносно папки проєкту)
        //файл "file2.txt" буде шукати в C:\Users\Анжела\IdeaProjects
        // "dir/file2.txt" спочатку папка dir
        //абсолютні шляхи не використовуються

        //методи для file2
        file2.isFile(); //чи дійсно це файл
        file2.exists(); //чи існує
        //file2.createNewFile();
        file2.canExecute();
        file2.canRead(); // - права доступу до файлу
        file2.canWrite();
        file2.deleteOnExit(); // видалити після завершення тесту


        //рідер для файлу - читай файл побайтово. тобто повертає по 1 символу. тому об'єднують в масив символів
        Reader reader = new FileReader(file2);   //throws FileNotFoundException
        //reader.read()

        //механізм рідеру, але з кешем (буфером). всередині використовує той самий Reader
        BufferedReader bufferedReader = new BufferedReader(reader);
        //bufferedReader.readLine() - прочитати весь рядок файлу. незручно коли багато рядків. бо треба контролювати чи є наступний рядок

        //Writer має такі ж недоліки
        Writer writer = new FileWriter(file2);
        writer.write('f');

        //з буфером. приймає на вхід певну послідовність, заповнює нею буфер. а потім записує вміст буфера в файл
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("тут можна передати строку яка буде розбита на символи і поміщена в буфер");


        //сучасний спосіб
        File file = new File("file.txt");
        //зчитати
        Files.readAllLines(file.toPath()); //прочитати весь файл, як аргумент приймає шлях до файлу
        //перезаписати вміст файлу
        List<String> lines = new ArrayList<>();
        Files.write(file.toPath(),lines);
        //записати в кінець файлу
        Files.write(file.toPath(),lines,StandardOpenOption.APPEND);
        //такий же спосіб як file2.deleteOnExit(); - видалити після закінчення тесту
        Files.write(file.toPath(),lines,StandardOpenOption.APPEND,StandardOpenOption.DELETE_ON_CLOSE);


    }
}
