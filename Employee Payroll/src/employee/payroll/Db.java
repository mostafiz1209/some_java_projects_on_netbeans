package employee.payroll;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;


public class Db {
    Connection conn=null;
    
    public static Connection java_db()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mostafiz-pc\\Documents\\NetBeansProjects\\Employee Payroll\\myDatabase.sqlite");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
