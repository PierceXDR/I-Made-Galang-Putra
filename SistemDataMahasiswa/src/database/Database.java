package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection connect(){

        try{

            String url = "jdbc:mysql://localhost:3306/kampus";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url,user,password);

            return conn;

        }catch(Exception e){

            System.out.println("Koneksi gagal");
            System.out.println(e.getMessage());

            return null;
        }
    }

}