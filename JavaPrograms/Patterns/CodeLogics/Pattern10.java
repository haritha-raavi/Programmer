import java.util.*;

public class Pattern10 {

	
	
	public static void printPattern(int n, char ch) {
//		The method for printing the first series in the pattern
//			     *
//			    ***
//			   *****
//			  *******
//			 *********
		{
		
		//Loop related to the number of rows
		for(int i=1; i<=n; i++) {
			//Loop related to number of spaces
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			
			//Loop related to number of stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(ch);
			}
			//To send the cursor to next line
			System.out.println();
		}
		}
	
	
	//The method for printing the second series in the pattern
//			*******
//			 *****
//			  ***
//			   *
	
		{
		//Loop related to number of rows
		for(int i=2; i<=n; i++) {
			//Loop related to printing the spaces
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			//Loop related to printing the stars
			for(int j=1; j<=(2*n)-(2*i)+1; j++) {
				System.out.print(ch);
			}
			//To send the cursor to the next line
			System.out.println();
		}
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
		scan.close();
		// Calling the printPattern method
		
		printPattern(n,ch);
		
	}
	

}
