import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
Name: Rowland Sanders
Class: CECS 277 Sec 02
Date: 9/1/2020
Demo Time: 5:20PM

*/
public class Main {

    public static int max(ArrayList<Integer> n){
        int max_num = n.get(0);
            for (int i : n) {
                if (i > max_num) {
                    max_num = i;
                }
            }
         return max_num;
    }

    public static int min(ArrayList<Integer> n){
        int min_num = n.get(0);
        for (int i : n) {
            if (i < min_num) {
                min_num = i;
            }
        }
        return min_num;
    }

    public static double ave(ArrayList<Integer> n){
        double ave = 0;
        for (int i : n) {
            ave += i;
        }
        return ave/n.size();
    }

    public static int sum(ArrayList<Integer> n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

    public static int mode(ArrayList<Integer> n) {
        int mode = n.get(0);
        int max = 0;

        Collections.sort(n);
        for(int i : n) {
            Integer current = n.get(i);
            Integer count = 1;
            for(int j : n) {
                if (n.get(j) == current) count++;
                if (count > max) {
                    mode = current;
                    max = count;
                }
            }
        }
        return mode;
    }

    public static void display(ArrayList<Integer> n) {
        int count = 0;
        for (int i : n) {
            System.out.printf("%03d ", i);
            count++;
            if(count == 40){
                System.out.println();
                count = 0;
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(1000);
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            Integer randomVariable = rand.nextInt(401)+100;
            numbers.add(randomVariable);
        }

        double ave = ave(numbers);
        int max = max(numbers);
        int min = min(numbers);
        int sum = sum(numbers);
        int mode = mode(numbers);

        display(numbers);
        System.out.println("\nAve:"+ ave);
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
        System.out.println("Sum:"+ sum);
        System.out.println("Mode:"+ mode);}
}


