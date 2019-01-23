
package cineplexticket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class countcomment {
public static void main( String args[] ) {

   Connection c = null;
   PreparedStatement pst = null;
   ResultSet rs= null;
   try {
      c= cinedb.javacinedb();
      System.out.println("Opened database successfully");
      Scanner scan = new Scanner(System.in);
      System.out.print("Search the movie:");
      String moviename = scan.nextLine();
      String query = "SELECT * FROM comment where moviename=?";
      pst = c.prepareStatement(query);
      pst.setString(1,moviename);
      rs=pst.executeQuery();
      String com ;
     

      while ( rs.next() ) 
      {
           com = rs.getString("comment");
         System.out.println( "moviename= " + moviename );
         System.out.println( "comment = " + com );
         System.out.println();
      }

   } 
   
   catch ( Exception e ) 
   {
     System.out.print("Error\n");
      
   }
   System.out.println("Operation done successfully");
  }
    
 
}

