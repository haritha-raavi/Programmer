
import java.util.Scanner;
public class Pattern12 {

	//The method for printing the pattern
	public static void printPattern(int n, char ch) {
		
		//Loop related to number of rows
		for(int i=1; i<=n; i++) {
			
			//Loop related to spaces
			for(int k=1; k<=n-i+1; k++)
				System.out.print(" ");
			//Loop related to stars
			for(int j=1; j<=i; j++)
				System.out.print(ch);
			//To send the cursor to the next line
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

