/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay Singh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JavaConnect {
    public static final String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver";
    public static final String USER="system";
    public static final String PASSWORD="ajaysingh";
    public static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    public static Connection con;
    
    public static Connection connectDB(){
        con=null;
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    public static void closeConnection(){
        try{
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
