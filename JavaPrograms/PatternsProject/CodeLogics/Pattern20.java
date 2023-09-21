import java.util.*;
public class Pattern20 {
	
	//The method for printing the pattern
	public static void printPattern(int n) {
		//Loop related to rows
		for(int i=1; i<=n; i++) {
			
			//Loop for columns
			for(int j=1; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[]) {
		//Creating object for scanner class
		
		Scanner scan = new Scanner(System.in);
		//Reading user input
		System.out.println("Enter number of rows");
		
		int rows = scan.nextInt(); // To store rows count
		printPattern(rows);
	}
}
