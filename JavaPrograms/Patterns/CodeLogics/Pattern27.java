import java.util.*;

public class Pattern27 {
	public static void printPattern(int n) {
		int temp = 3;
		//Loop for the rows
		for(int i=1; i<=n; i++) {
			//Loop for the columns
			for(int j=1; j<=n; j++) {
				System.out.print(temp+" ");
				temp+=3;
			}
			System.out.println();
		}
	}
	// Main method
	public static void main(String arg[]) {
		
		//Creating object for scanner class
		Scanner scan = new Scanner(System.in);
		//Reading input form the user
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();
		//closing scanner object
		scan.close();
		printPattern(rows);
	}
}
