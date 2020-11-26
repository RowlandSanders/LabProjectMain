import java.io.File; 
import java.util.Scanner; 
import java.io.FileNotFoundException; 

public class Main {
  public static void main(String[] args) {

    try {
      RedBlackTreeMap<String, Integer> RedBlackT = new RedBlackTreeMap<String, Integer>();

      int currentLine = 0;
      File mainObject = new File("players_homeruns.csv");
      Scanner fileReader = new Scanner(mainObject);

      while ((currentLine < 5) && fileReader.hasNext())
      {
        String line = fileReader.nextLine();
        String[] items = line.split(",");
        RedBlackT.add(items[0], Integer.parseInt(items[1]));

        if (!line.equals("")) 
          currentLine++;
      }

      System.out.println("\n *** Inserting first five elements ***");
      RedBlackT.printStructure();
      System.out.print("\n");

      while ((currentLine < 10) && fileReader.hasNext()) 
      {
        String line = fileReader.nextLine();
        String[] items = line.split(",");
        RedBlackT.add(items[0], Integer.parseInt(items[1]));

        if (!line.equals("")) 
          currentLine++;
      }

      System.out.println("\n *** Inserting next five elements *** ");
      RedBlackT.printStructure();
      System.out.print("\n");

      System.out.println("\n *** Before total Insertion *** ");
      System.out.printf("The key that is a leaf: (Babe Ruth) : %d\n", RedBlackT.find("Babe Ruth"));
      System.out.printf("The key that is a root: (Honus Wagner) : %d\n", RedBlackT.find("Honus Wagner"));
      System.out.printf("The key that has a NIL & NON NIL child: (Rogers Hornsby) : %d\n", RedBlackT.find("Rogers Hornsby"));
      System.out.printf("The key that is a red node: (Ted Williams) : %d\n", RedBlackT.find("Ted Williams"));
      System.out.print("\n");

      while (fileReader.hasNext()) 
      {
        String line = fileReader.nextLine();
        String[] items = line.split(",");
        RedBlackT.add(items[0], Integer.parseInt(items[1]));

        if (!line.equals("")) 
          currentLine++;
      }

      System.out.println("\n *** After total insertion *** ");
      System.out.printf("The key that is a leaf: (Babe Ruth) : %d\n", RedBlackT.find("Babe Ruth"));
      System.out.printf("The key that is a root: (Honus Wagner) : %d\n", RedBlackT.find("Honus Wagner"));
      System.out.printf("The key that has a NIL & NON NIL child: (Rogers Hornsby) : %d\n", RedBlackT.find("Rogers Hornsby"));
      System.out.printf("The key that is a red node : (Ted Williams) : %d\n", RedBlackT.find("Ted Williams"));

      fileReader.close();
      System.out.printf("\nDistinct key count: %d\n", RedBlackT.getCount());
      
      
    } catch (FileNotFoundException exception) {
      System.out.println("An error occurred.");
      exception.printStackTrace();
    }
  }
}