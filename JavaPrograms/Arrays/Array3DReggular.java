import java.util.*;
public class Array3DReggular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of blocks , rows and columns"); //blocks=colleges, classes = rows, students = columns
		
		//Creating an three(3D) Dimensional reggular array for storing student data
		String[][][] array = new String[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		//Reading data from user and store it into the array
		for(int i=0 ; i<=array.length-1; i++) {
			for(int j=0; j<=array[i].length-1; j++) {
				for(int k=0; k<=array[i][j].length-1; k++) {
					//Reading data from user and storing in required format
					System.out.println("Is "+(k+1)+" Student from college "+(i+1)+" class "+(j+1)+" Completed project");
				if(scan.nextBoolean())
					array[i][j][k] = "YES";
				else
					array[i][j][k] = "NO";
				}
			}
		}
		
		//Data retrieving 
		for(int i=0; i<=array.length-1; i++) {
			for(int j=0; j<=array[i].length-1; j++) {
				System.out.println("The updates of college "+(i+1)+" class "+(j+1)+" students are");
				for(int k=0; k<=array[i][j].length-1; k++) {
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
