import java.util.Random;
import java.util.Scanner;


public class Main{
    
    static Scanner scan = new Scanner(System.in);
    
    static int[] mainArray = {-2,-3,4,-6,7,9,-10,1,12,-8}; //10 values
	static int[] mixedArray = {-2,-54,11,26,29,34,-19,-75,20,-81,90}; //11 values
	static int[] nullArray = new int[0]; //null
	static int[] negArray = {-61,-13,-3,-9,-54,-11,-31,-53,-21,-17};
	static int[] zeroArray = {0,0,0,0,0,0,0,0,0,0};
	static int[] posArray = {51,22,53,41,79,66,4,88,17,31};
	static boolean check = true;
		
    public static void main(String args[])
    {
        int choice;
        while(check){
            System.out.print("\n----Main Menu----\n");
			System.out.println("1. Quit the program\n"
					+ "2. mainArray\n"
					+ "3. mixedArray\n"
					+ "4. nullArray\n"
					+ "5. negArray\n"
					+ "6. zeroArray\n"
				    + "7. posArray\n");
            choice = scan.nextInt();

			if (choice == 1){
				System.out.println("\nquit");
				System.exit(0);
			}
			
            else{
            switch(choice)
            {
                case 1:
                    System.out.println("Quit program");
                    
                case 2:
                    int[] mainArray = {-2,-3,4,-6,7,9,-10,1,12,-8};
                    //mainArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(mainArray));
                    System.out.println("Sophie Test - "+ sophie(mainArray));
                    System.out.println("Johnny Test - "+ johnny(mainArray));
                    System.out.println("Sally Test - "+ sally(mainArray));
                    break;
                
                case 3:
                    int[] mixedArray = {-2,-54,11,26,29,34,-19,-75,20,-81,90};
                    //mixedArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(mixedArray));
                    System.out.println("Sophie Test - "+ sophie(mixedArray));
                    System.out.println("Johnny Test - "+ johnny(mixedArray));
                    System.out.println("Sally Test - "+ sally(mixedArray));
                    break;
                    
                case 4:
                    int[] nullArray = new int[0];
                    //nullArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(nullArray));
                    System.out.println("Sophie Test - "+ sophie(nullArray));
                    System.out.println("Johnny Test - "+ johnny(nullArray));
                    System.out.println("Sally Test - "+ sally(nullArray));
                    break;
                    
                case 5:
                    int[] negArray = {-61,-13,-3,-9,-54,-11,-31,-53,-21,-17};
                    //negArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(negArray));
                    System.out.println("Sophie Test - "+ sophie(negArray));
                    System.out.println("Johnny Test - "+ johnny(negArray));
                    System.out.println("Sally Test - "+ sally(negArray));
                    break;
                    
                case 6:
                    int[] zeroArray = {0,0,0,0,0,0,0,0,0,0};
                    //zeroArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(zeroArray));
                    System.out.println("Sophie Test - "+ sophie(zeroArray));
                    System.out.println("Johnny Test - "+ johnny(zeroArray));
                    System.out.println("Sally Test - "+ sally(zeroArray));
                    break;
                    
                case 7:
                    int[] posArray = {51,22,53,41,79,66,4,88,17,31};
                    //posArray = getValues();
                    System.out.println("Freddy Test - "+ freddy(posArray));
                    System.out.println("Sophie Test - "+ sophie(posArray));
                    System.out.println("Johnny Test - "+ johnny(posArray));
                    System.out.println("Sally Test - "+ sally(posArray));
                    break;
                
                default: System.out.println("\nInput not within bound");
					break;    
            } 
            
            }
        }
    }

	    public static int freddy(int[] a){
		int max = 0;
			
		for(int i = 0; i < a.length+1; i++){
			for (int j = i; j < a.length+1; j++){
				    
				int thisSum=0;
				for (int k = i; k < j; k++){
					thisSum = thisSum + a[k];
					if (thisSum > max){
						max = thisSum;
						}
					}
				}
			}
			return max;
		}
		
		
		public static int sophie(int[] a){
			int max = 0;
			int thisSum;
			
			for(int i = 0; i < a.length; i++){
				thisSum = 0;
				for(int j = i; j < a.length; j++){
					thisSum = thisSum + a[j];
					if (thisSum > max){
						max = thisSum;
					}
				}
			}
			return max;
		}
		
		
		public static int johnny(int[] a){
			int right = a.length -1;
			if (right < 0){
				right = 0;
			}
			return max3(a, 0, right);
		}

		
		public static int max3(int[] a, int left, int right){
			if (left == right){

				if(a[left] > 0){
					return a[left]; 
				}
				return 0;
			}

			int center = (int) Math.floor((left+right)/2);

			int maxLeftSum = max3(a, left, center);
			int maxRightSum = max3(a, center+1, right);
			int maxLeftBorder = 0;
			int leftBorder = 0;
			
			for (int i = center; i >= 0; i--){
				leftBorder = leftBorder + a[i];
				if (leftBorder > maxLeftBorder){
					maxLeftBorder = leftBorder;
				}
			}
		
			int maxRightBorder = 0;
			int rightBorder = 0;
			
			for (int i = center+1; i < (a.length); i++){
				rightBorder = rightBorder + a[i];
				if (rightBorder > maxRightBorder){
					maxRightBorder = rightBorder;
				}
			}
			return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorder + maxRightBorder);
		}
		
		
		public static int sally(int[] a){
			int max = 0;
			int thisSum = 0;
			for (int i = 0; i < (a.length); i++){
				thisSum = thisSum + a[i];
				if (thisSum > max){
					max = thisSum;
				}
				else if (thisSum < 0){
					thisSum = 0;
				}
			}
			return max;
		}	
}









