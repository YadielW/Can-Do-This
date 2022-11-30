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
	if (userChoice==1) {
	System.out.print("What size of array would you like: ");  
	int n;  
	Scanner sc=new Scanner(System.in);  
	n=sc.nextInt();  
	int[] array = new int[n];  
	System.out.println("Enter the values of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	array[i]=sc.nextInt();  
	}  
	for (int i=0; i<n; i++)   
	{  
	
	}  
	System.out.println("Your maximum value is:" );  
	System.out.println("Your minimum value is:" );  
	System.out.println("Your array average is:" );  
	System.out.println("Your array sorted is:" );  
	Arrays.sort(array);
	for (int i:array) {
		System.out.println(i +" ");  
	}
	}
	}
}