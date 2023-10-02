import java.util.*;

public class Pattern29 {
	public static void printPattern(int n) {
		int even = 2;
		int odd = 1;
		//Loop for the rows
		for(int i=1; i<=n; i++) {
			//Loop for the columns
			for(int j=1; j<=n; j++) {
				if(i%2 == 0) {
					if(odd < 10)
						System.out.print("0");
					System.out.print(odd+" ");
					odd+=2;
				}
				else {
					if(even < 10) 
						System.out.print("0");
					System.out.print(even+" ");
					even+=2;
				}
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
