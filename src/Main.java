import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	int userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose which program?");
		System.out.println("1. Arrays");
		System.out.println("2. Nested");
		System.out.println("3. Operators");
		System.out.println("4. Repetition");
		System.out.println("5. Selection");
		System.out.println("6. Subprograms");
		System.out.println("7. Variables");
		System.out.println("8. Quit");
		userChoice=in.nextInt();
	if (userChoice==4) {
		int mini = 0;
		int maxi = 9;
		int rand1 = (int) Math.floor(Math.random()*(maxi-mini+1)+mini);
		int rand2 = (int) Math.floor(Math.random()*(maxi-mini+1)+mini);
		int rand3 = (int) Math.floor(Math.random()*(maxi-mini+1)+mini);
		String randoms = (rand1+","+rand2+","+rand3);
		
		int counter = 0;
		do {
			
		}
		
		
		
		
	}
	if (userChoice==3) {
		System.out.println("Enter your number: ");
		int num= in.nextInt();
		int sub = num - 1;
		System.out.println(num + " - 1 = " + sub);
		int mult = sub*3;
		System.out.println(sub + " × 3 = " + mult);
		int add = mult + 12;
		System.out.println(mult + " + 12 = " + add);
		int div = add/3;
		System.out.println(add + " ÷ 3 = " + div);
		int add2 = div + 5;
		System.out.println(div + " + 5 = " + add2);
		int sub2 = add2 - num;
		System.out.println(add2 + " - " + num + " = " + sub2);
	}
	if (userChoice==2) {
		System.out.println("What's the first value?");
		int nestOne= in.nextInt();
		System.out.println("What's the second value?");
		int nestTwo= in.nextInt();
		for(int q=1; q<=nestTwo; q++) {
			for (int r=1; r<=nestOne; r++) {
				System.out.print(r*q+"\t");
			}
			System.out.println("\n");
		}
	}
	if (userChoice==1) {
	System.out.print("What size of array would you like: ");  
	int n;  
	n=in.nextInt();  
	int[] array = new int[n];  
	System.out.println("Enter the values of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	array[i]=in.nextInt();  
	}  
	for (int i=0; i<n; i++)   
	{  
	
	}  
	double sum = 0.0, avg = 0.0;
	for(int b = 0; b < array.length; b++) {
		sum = sum + array[b];
		avg = sum / array.length;
	}
    int max = getMax(array);
	System.out.println("Your maximum value is:" + max);  
    int min = getMin(array);
	System.out.println("Your minimum value is:" + min);  
	System.out.println("Your array average is:" + avg);  
	System.out.println("Your array sorted is:" );  
	Arrays.sort(array);
	for (int i:array) {
		System.out.println(i +" ");  
	}
	}
	}

	private static int getMin(int[] array) {
		// TODO Auto-generated method stub
		   int minValue = array[0]; 
		    for(int h=1;h<array.length;h++){ 
		      if(array[h] < minValue){ 
		        minValue = array[h];
		      }
		    }
		return minValue; 
	}

	private static int getMax(int[] array) {
		// TODO Auto-generated method stub
		  int maxValue = array[0]; 
		    for(int h=1;h < array.length;h++){ 
		      if(array[h] > maxValue){ 
		         maxValue = array[h]; 
		      } 
		    } 
		    return maxValue; 
		    
		
	}
}