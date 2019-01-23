
package cineplexticket;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countword {
  
	public static void main(String[] args) throws IOException {

	FileInputStream fin = new FileInputStream("dist/comment.txt");
        Scanner fileInput = new Scanner(fin);
        ArrayList<String>words = new ArrayList<>();
        ArrayList<Integer>count = new ArrayList<>();
        while(fileInput.hasNext())
        {
          String nextWord = fileInput.next();
          if(words.contains(nextWord)){
              int index = words.indexOf(nextWord);
              count.set(index,count.get(index)+1);
          }
          else
          {
              words.add(nextWord);
              count.add(1);
              
          }
        }
        
        fileInput.close();
        fin.close();
        
        
        
        for(int i =0;i<words.size();i++)
        {
            System.out.println(words.get(i)+""+count.get(i));
        }
        }     
}
