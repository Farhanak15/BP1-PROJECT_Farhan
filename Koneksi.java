package tugas.project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Koneksi {
 Connection con;


public  Koneksi() {
   
        String url = "jdbc:mysql://localhost:3306/db_project";
        String id = "root";
        String pass ="";
        String Driver = "com.mysql.jdbc.Driver";
        try{
        Class.forName(Driver).newInstance();
        con = DriverManager.getConnection(url,id,pass);
    } catch(Exception e){
        System.out.println("" +e.getLocalizedMessage());
    }
 }
public static void main(String[]args){
    Koneksi k = new Koneksi();
}

}