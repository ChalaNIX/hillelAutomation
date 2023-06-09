package ua.hillel.automation.java.files22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class RealFile {
    public static void main(String[] args) throws IOException {
        //в проєкті створюємо директорію files і файл users.csv
        File usersFile = new File("files/users.csv");

        List<String> lines = Files.readAllLines(usersFile.toPath());

        //розбити першу строку на ключі
        List<String> headers = Arrays.stream(lines.get(0).split(",")).toList();
        List<Map<String, String>> users = new ArrayList<>();
        for (int i=1; i<lines.size(); i++) {
            Map<String, String> user = new HashMap<>();
            List<String> line = Arrays.stream(lines.get(i).split(",")).toList();

            for (int j=0; j<line.size(); j++) {
                user.put(headers.get(j), line.get(j));
            }
            users.add(user);
        }

        System.out.println(users);


        //https://the-internet.herokuapp.com/download
    }
}
