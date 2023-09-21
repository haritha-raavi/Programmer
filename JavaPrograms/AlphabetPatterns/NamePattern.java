import java.util.*;
public class NamePattern {
	public static void main(String arg[]) {
		
		//Creating object for scanner class 
		Scanner scan = new Scanner(System.in);
		//Reading user input
		System.out.println("Enter the number");
		int n = scan.nextInt();
		//closing scanner object
		scan.close();
		
		//outer loop for rows
		for(int i=0; i<=n-1; i++) {
			
			//Inner Loop for the N pattern
			for(int j=0; j<=n-1;j++) {
				//Stars will print according to these conditions
				if(j==0 || j==n-1 || i==j) 
					System.out.print("*");
				else		//Remaining spaces will print
					System.out.print(" ");
			}
			
			System.out.print("\t");
			//Inner Loop for the A pattern
			for(int j=0; j<=n-1;j++) {
				//Stars will print according to these conditions
				if(j==0 || j==n-1 || i==0 || i==n/2) 
					System.out.print("*");
				else		//Remaining spaces will print
					System.out.print(" ");
			}
			
			System.out.print("\t");
			//Inner Loop for the M pattern
			for(int j=0; j<=n-1;j++) {
				//Stars will print according to these conditions
				if(j==0 || j==n-1 || (i == j && i<=n/2) || (i+j == n-1 && i<=n/2)) 
					System.out.print("*");
				else		//Remaining spaces will print
					System.out.print(" ");
			}
			
			System.out.print("\t");
			//Inner Loop for the E pattern
			for(int j=0; j<=n-1;j++) {
				//Stars will print according to these conditions
				if(j==0 || i==n-1 || i == 0 || i == n/2 ) 
					System.out.print("*");
				else		//Remaining spaces will print
					System.out.print(" ");
			}
			//To send cursor to the next line
			System.out.println();
		}
	}
}

