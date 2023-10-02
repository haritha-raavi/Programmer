// Importing the utility package

import java.util.*;
public class Pattern7 {

	// The method for printing the pattern
	
	public static void printPattern(int n, char ch) {
		// The loop related to rows
		for(int i=1 ; i<=n; i++) {
			
			//The loop related to spaces in the current row
			for(int k=1; k<=n; k++) {
				System.out.print(" ");
			}
			
			// The loop related to printing stars
			for(int j=1; j<=n; j++) {
				System.out.print(ch);
			}
			//To send cursor to the next line
			System.out.println();
		}
	}
	
	
	// The main method
	
	public static void main(String arg[]) {
		
		//Creating object for the scanner class
		
		Scanner scan = new Scanner(System.in);
		//Taking user input
		
		System.out.println("Enter the character:");
		char ch = scan.nextLine().charAt(0);
		
		System.out.println("Enter the count of lines");
		int n = scan.nextInt();
		
		// Calling the printPattern method
		
		printPattern(n,ch);
	}
}
