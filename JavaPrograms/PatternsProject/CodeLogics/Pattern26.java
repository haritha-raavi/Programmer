import java.util.*;
public class Pattern26 {
	public static void printPattern(int n) {
		// variable for displaying
		int temp = 2;
		//Loop for rows
		for(int i=1; i<=n; i++) {
			//Loop for columns
			for(int j=1; j<=i; j++) {
				if(temp < 10)
					System.out.print("0");
				System.out.print(temp+" ");
				temp+=2;
			}
			System.out.println();
		}
	}


	//Main method
	public static void main(String arg[]) {
		//Object creation for the scanner class
		
		Scanner scan = new Scanner(System.in);
		//Reading input from the user
		System.out.print("Enter the number of rows:");
		int rows = scan.nextInt();
		//closing scanner class object
		scan.close();
		
		printPattern(rows);
		
	}

}
