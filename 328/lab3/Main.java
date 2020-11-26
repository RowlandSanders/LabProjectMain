  
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) {
        try {
            HashSet<String> HS = new HashSet<String>(50);
          

            File myObj = new File("trump_speech.txt");
            Scanner read = new Scanner(myObj);
            while (read.hasNext()) {

                String word = read.next().replaceAll("[^a-zA-Z0-9]", "");

                if (!word.equals("")){
                    HS.add(word);
                }
            }
            
            System.out.println("\nThere is "+ HS.count() + " \033[2mDistinct\033[0m words. ");
            read.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("txt file is missing");
        }
      }
}