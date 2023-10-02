import java.util.*;
public class Array1D {
	
	public static void main(String arg[]) {
		//Creating scanner class object
		Scanner scan = new Scanner(System.in);
		
		//The multiple ways to create an one dimensional array.
		//int arr[] = new int[size];
		//int []arr = new int[size];
		//int[] arr = new int[size];
		//int [] arr = new int[size];
		
		//Creating an one dimensional array with the size of user defined.
		System.out.println("Enter the length of the array:");
		int[] arr = new int[scan.nextInt()];
		
		//Reading data from the user to store into the array
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter the data value "+(i+1));
			arr[i] = scan.nextInt(); //Storing into array
		}
		//Retrieving the data
		System.out.println("The data present in the array is:");
		for(int i=0; i<=arr.length-1; i++)
			System.out.print(arr[i]+" ");
		
	}
}
