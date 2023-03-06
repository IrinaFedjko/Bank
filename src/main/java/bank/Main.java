package bank;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbcfun?serverTimezone=UTC";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = ""; //didnt create a password in sql

    public static void main(String[] args) throws SQLException {
        Connection myConnection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
 //       ResultSet resultSet = statement.executeQuery("SELECT * FROM projects");

//        ArrayList<Project> projects = new ArrayList<>();
//
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            int budget = resultSet.getInt("budget");
//            Project project = new Project(id, name, budget);
//            projects.add(project);
//        }
//
//        for (Project project : projects) {
//            System.out.println(project);
//        }




    }
}