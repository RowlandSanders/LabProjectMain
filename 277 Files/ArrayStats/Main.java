import java.util.Random;
public class Main
{
    public static int max(int [] n)
    {
        int max = 0;
        for (int i = 0; i<20;i++){
            if(n[i] > max) max = n[i];
        }
        return max;
    }
    
    public static int min(int [] n)
    {
        int min = 600;
        for (int i = 0; i<20;i++){
            if(n[i] < min) min = n[i];
        }
        return min;
    }
    public static double ave(int [] n)
    {
        double ave = sum(n) / (double)20;
        return ave;
        
    }
    
    public static int sum(int [] n)
    {
        int sum = 0;
        for(int i =0;i<20;i++){
            sum += n[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        int [] A1;
        A1 = new int[20];
        
        for (int i =0;i<A1.length;i++){
            A1[i] = rand.nextInt(500 - 100 + 1) + 100;
            System.out.print(A1[i] + " ");
        }
        
        System.out.println(" ");
        double ave = ave(A1);
        int max = max(A1);
        int min = min(A1);
        int sum = sum(A1);
        
        System.out.println("Ave: "+ ave);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("Sum: "+ sum);
        
    
}
}
