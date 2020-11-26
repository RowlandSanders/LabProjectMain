// Rowland Sanders
// Class (CECS 277-01)
// Project Name (Prog 0 – Happy Birthday)
// Due Date (Sept 1, 2020)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String reply;
        int age;
        int birthYear;
        char thisYear;
        
        System.out.print("What is your name?");
        name = in.next();
        System.out.print("How old are you " + name + "?");
        age = in.nextInt();
        System.out.print(name +", have you had your birthday yet this year? (y/n)");
        reply = in.next();
        thisYear = reply.charAt(0);
        if (thisYear == 'y' || thisYear == 'Y')
            birthYear = 2020 - age;
        else
            birthYear = 2020 - age - 1;
        System.out.println("I guess that you were born in " + birthYear);
        
    }
        
}

