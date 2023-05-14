package ua.hillel.automation.java.lesson10Exceptions.BDExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlConfig {
    public void getSqlConfig() {
//        Connection connection = null;
//        try {
//            connection= DriverManager.getConnection("DB_URL", "DB user", "DB_PASS");
//        }catch(SQLException sqlException) {
//            System.out.println("");
//        }finally {
//            if(connection !=null) {
//                try {
//                    connection.close();
//                }catch(SQLException e) {
//
//                }
//
//            }
//        }
        //якщо ресурс вписати в дужках для try, він автоматично буде закритий після try
        try(Connection connection = DriverManager.getConnection("DB_URL", "DB user", "DB_PASS")) {
        connection.beginRequest();
        }catch(SQLException e) {

        }
    }
}
