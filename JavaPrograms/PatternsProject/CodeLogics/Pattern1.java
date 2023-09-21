import java.util.*;
public class Pattern1 {
	//Method for displaying the pattern
	public static void printPattern(char ch) {
		System.out.println(ch);
	}
	
	public static void main(String arg[]) {
		// Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		//Reading users input 
		
		char ch = scan.next().charAt(0);
		//Closing scanner class object
		
		scan.close();
		printPattern(ch);
		
	}
}
