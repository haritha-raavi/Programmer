//importing the utility package

import java.util.*;

public class Pattern6 {
	
	// The method for printing the pattern
	public static void printPattern(int n, char ch) {
		
		//Loop for the count of rows
		for(int i=1; i<=n; i++) {
			// Loop for the number of columns in the ith row
			for(int j=1 ; j<=n-i+1; j++) {
				System.out.print(ch);
			}
		 
			System.out.println();
			
		}
		
		/** //Second method for the same pattern
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		*/
	}
	
	public static void main(String arg[]) {
		
		//Creating object for the scanner class
		
		Scanner scan = new Scanner(System.in);
		
		//  Taking user input
		
		System.out.println("Enter the Character:");
		char ch = scan.nextLine().charAt(0);
		
		System.out.println("Enter the count:");
		int n = scan.nextInt();
		
		printPattern(n,ch);
	}

}
