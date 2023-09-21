//Importing the utility package
import java.util.*; 
public class Pattern5 {
	
	public static void printPattern(int n,char ch) {
		for(int i=1; i<=n; i++) { // rows	
			for(int j=1; j<=i; j++) { // columns		
				System.out.print(ch);
			}
			// skip to the nextLine
			System.out.println();
		}
	}
	public static void main(String arg[]) {
		
		//Creating object for the scanner class
		
		Scanner scan = new Scanner(System.in);
		
		//  Taking user input
		
		System.out.println("Enter the Character:");
		char ch = scan.nextLine().charAt(0);
		
		System.out.println("Enter the count:");
		int n = scan.nextInt();
		
		printPattern(n,ch);
	}

}
