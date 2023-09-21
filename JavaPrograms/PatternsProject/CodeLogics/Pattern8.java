import java.util.Scanner;
//Importing the utility package

import java.util.*;
public class Pattern8 {
	
	//The method for printing the pattern
	public static void printPattern(int n, char ch) {
		
		//The loop related to the number of rows
		for(int i=1; i<=n; i++) {
			
			//The loop related to printing space in each row
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			
			//The loop related to printing stars in each row
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print(ch);
			}
			
			//To send the cursor to next line
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
