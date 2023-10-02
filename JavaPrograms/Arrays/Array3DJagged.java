import java.util.Scanner;
public class Array3DJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of blocks:"); //blocks=colleges, rows = classes, columns = students
		
		//Creating an three(3D) Dimensional Jagged array for storing student data
		String[][][] array = new String[scan.nextInt()][][]; //Partially created with only blocks
		
		//Adding rows for each block 
		for(int i=0; i<=array.length-1; i++) {
			System.out.println("Enter number of rows for block "+(i+1));
			array[i] = new String[scan.nextInt()][];
		}
		//Adding columns for each row in each block
		for(int i=0; i<=array.length-1; i++) { 
			for(int j=0 ; j<=array[i].length-1; j++) {
					System.out.println("Enter the number of columns for row "+(j+1)+" of block "+(i+1));
					array[i][j] = new String[scan.nextInt()];
			}
		}
		//Reading data from user and store it into the array
		for(int i=0 ; i<=array.length-1; i++) {						//blocks
			for(int j=0; j<=array[i].length-1; j++) {				//rows
				for(int k=0; k<=array[i][j].length-1; k++) {		//columns
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
