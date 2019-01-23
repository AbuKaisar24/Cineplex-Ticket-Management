
package cineplexticket;
import java.sql.*;
import javax.swing.JOptionPane;

public class cinedb {
 Connection conn = null;
 public static Connection javacinedb()
 {
     try{
         Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection("jdbc:sqlite:cinedata.sqlite");
         return conn;
         
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
           return null;
     }
   
 }
}
