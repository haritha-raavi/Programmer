//importing utility package

import java.util.*;
public class Pattern2 {

	public static void printPattern(int n, char ch) {
		for(int i=1; i<=n; i++) {
			// Printing character
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		//Creating scanner class object
		
		Scanner scan  = new Scanner(System.in);
		//Taking user input for the character to print
		System.out.println("Enter the character:");
		char ch = scan.nextLine().charAt(0);
		
		// Taking user input for lines count
		System.out.println("Enter the no of lines:");
		int count  = scan.nextInt();

		printPattern(count,ch);

	}

}
