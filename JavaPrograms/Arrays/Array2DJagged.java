import java.util.*;
public class Array2DJagged {
	public static void main (String arg[]) {
		// Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		
		//Creating an two dimensional Jagged array to store the percentages of students for each class
		System.out.println("Enter the number of classes");
		float[][] array = new float[scan.nextInt()][]; //Array was partially created through rows only
		//Adding columns for each through user input
		for(int i=0; i<=array.length-1; i++) {
			System.out.println("Enter the number of students in class - "+(i+1));
			array[i] = new float[scan.nextInt()]; //Creating object for adding columns to each row
		}
		
		//Storing data into 2D jagged array
		for(int i=0; i<=array.length-1; i++) {
			for(int j=0 ;j<=array[i].length-1; j++) {
				System.out.println("Enter the percentage of "+(j+1)+" student in class -"+(i+1));
				array[i][j]= scan.nextFloat();
			}
		}
		
		//Retrieving the data
		for(int i=0; i<=array.length-1; i++) {
			System.out.println("The percentages of class "+(i+1)+" students are :");
			for(int j=0; j<=array[i].length-1; j++) {
				System.out.println(array[i][j]+" ");
			}
		}
		
	}
}
