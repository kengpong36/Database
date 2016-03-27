package databasemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager extends javax.swing.JFrame {

    public static Connection connection;
    public static ResultSet resultSet;
    public static Statement statement;
    public static String sql;

    public DatabaseManager() {
        
        try {
            String url = "jdbc:derby://localhost:1527/students";
            String username = "root";
            String password = "1234";

            Connection con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();
        
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Insert() {
        sql = "INSERT INTO students(first_name,last_name,address) VALUES('sss','kumlib','xxxxxxxx')";
    }

    public ResultSet Select() {
        sql = "SELECT*FROM students";

        try {
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
//            System.out.println("\t"+resultSet.getInt("id")+"\t\t"+resultSet.getString("first_name")+"\t\t"+
//                    resultSet.getString("last_name")+"\t\t"+resultSet.getString("address"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public void Update() {
        sql = "UPDATE students set first_name='B' where id=1";
        try {
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Delete() {
        sql = "DELETE FROM students WHERE id=1 ";
    }

    public static void main(String[] args) {

        new DatabaseManager();
        view obj = new view();
        obj.show();
    }

}
