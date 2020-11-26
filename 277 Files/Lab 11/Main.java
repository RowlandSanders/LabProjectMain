///Angel Cueva 
//Benjamin Nguyen

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    
    HashMap<String,ArrayList<String>> friendList = new HashMap<>();
    
    ArrayList<String> sue = new ArrayList<String>();
    ArrayList<String> cathy = new ArrayList<String>();
    ArrayList<String> bob = new ArrayList<String>();

    Collections.addAll(sue, "Bob","Jose", "Alex", "Cathy");
    Collections.addAll(cathy, "Bob", "Alex");
    Collections.addAll(bob, "Alex", "Jose", "Jerry");

    friendList.put("Sue",sue);
    friendList.put("Cathy",cathy);
    friendList.put("Bob", bob);

    System.out.println("Enter a name.");
    Scanner userInput = new Scanner(System.in);
    String name = userInput.nextLine();
    
    if (friendList.get(name) == null){
      System.out.println(name + " is not found in HashMap.");
    }else{
      System.out.println(name + " is found in HashMap");
      for (String a : friendList.get(name)){
        System.out.println(a);
      }
    }
  }
}