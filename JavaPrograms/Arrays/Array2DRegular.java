import java.util.*;
public class Array2DRegular {
	public static void main(String arg[]) {
		//Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		
		//Creating an two dimensional regular array
		System.out.println("Enter the no of rows and columns:");
		String array[][] = new String[scan.nextInt()][scan.nextInt()];
		scan.nextLine(); //Dummy input line
		
		//Storing the data into array
		for(int i=0; i<=array.length-1; i++) {
			for(int j=0; j<=array[i].length-1; j++) {
				System.out.println("Enter the name of "+(j+1)+" student of class - "+(i+1));
				array[i][j] = scan.nextLine();	
			}
		}
		scan.close();
		//Retrieving the data
		for(int i=0 ;i<=array.length-1; i++) {
			System.out.println("The names of class "+(i+1)+" students are :");
			for(int j=0; j<=array[i].length-1;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}

