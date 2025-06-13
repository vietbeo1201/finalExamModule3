package com.example.finalmodule3.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static String url = "jdbc:mysql://localhost:3306/finalModule3";
    private static String user = "root";
    private static String password = "123456@Abc";
    private static Connection conn = null;

    public static Connection getConnection() {
//        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("driver or db connection error");
            e.printStackTrace();
        }
        return conn;

    }
}
