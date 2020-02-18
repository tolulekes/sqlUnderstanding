package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection c = null;
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:info.db");

            String SQLAdd;
            SQLAdd = "insert into" + " admin(user, password)" + "('Aisosa', '123434')";
            Statement stmt = c.createStatement();
            stmt.executeUpdate(SQLAdd);
            System.out.println("Connected Successfully");
            c.close();
        }
        catch (Exception ex){
            System.out.println("Cannot Connect" + ex.getMessage());
            System.exit(0);
        }

    }
}
