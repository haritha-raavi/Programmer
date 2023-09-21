import java.util.Scanner;
public class PatternM {
	//The method contains the logic of displaying pattern
	public static void printPattern(int n) {
		//the outer loop regarding the number of rows
		for(int i=0; i<=n-1; i++) {
			//Loop to iterate through all columns in each row
			for(int j=0; j<=n-1; j++) {
				//Printing the starts only based on these conditions
				if(j==0 || j==n-1 || (i==j && i<=n/2) || (i+j == n-1 && i<=n/2))
					System.out.print("*");
				else 
					System.out.print(" ");  //Or else print the space instead of the stars
			}
			
			//to send the cursor to next line
			System.out.println();
		}
	}
	public static void main(String arg[]) {
		//Creating scanner class object to read the input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int userInput = scan.nextInt(); //Reading user input
		
		scan.close(); //closing the scanner object
		//Calling the static method to display pattern
		printPattern(userInput);
	}
}

