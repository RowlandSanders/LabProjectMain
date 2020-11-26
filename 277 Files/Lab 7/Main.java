import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws FileNotFoundException {

          Scanner input = new Scanner(System.in);
          String inputFileName = "ziptable.txt";
          System.out.print("Vowels file: ");
          String vowelsputInfo = input.next();

          System.out.print("Constant file: ");
          String constantputInfo = input.next();
          input.close();
      
       // Construct the Scanner and PrintWriter objects for reading and writing
      
          File inputFile = new File(inputFileName);
          Scanner in = new Scanner(inputFile);
          PrintWriter vowels = new PrintWriter(vowelsputInfo);
          PrintWriter constant = new PrintWriter(constantputInfo);
      
       // Read the input and write the output
             
          while (in.hasNextLine())
          {
              String line = in.nextLine();
              if ((line.charAt(0)=='A') || (line.charAt(0)=='E')||(line.charAt(0)=='I')||(line.charAt(0)=='O')||(line.charAt(0)=='U')){
                vowels.println(line);
              }
              else{
                constant.println(line);
              }
              // // passes each line of the table file as a String to another Scanner constructor
              // Scanner lineScanner = new Scanner(line);
              // String abbreviation = lineScanner.next();

              // String name = lineScanner.next();
          
              // // Search all the tokens of the line
              // while (lineScanner.hasNext())
              // {
              //     String token = lineScanner.next();
              
              //     // case the token is a three digits number we change how we will print it
              //     if (token.matches("\\d{3}"))
              //     {
              //         name = name +" "+ token +"-"+token;
              //     }
              //     else
              //         {
              //          name = name +" "+ token;
              //         }
              // }
              // vowels.println(abbreviation + " " + name);
              // lineScanner.close();
          }
                 
          in.close();
          vowels.close();
          constant.close();
   }
}