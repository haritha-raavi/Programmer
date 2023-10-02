import java.lang.reflect.Array;
import java.util.*;
public class MINvalue {
	public static void main(String arg[]) {
		
		//Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		//Reading input from the user
		int array[] = new int[scan.nextInt()];
		
		System.out.println("Enter elements for the array:");
		for(int i=0; i<=array.length-1; i++) {
			array[i] = scan.nextInt();
		}
		int smallest = array[0];	//Assuming the first index value of array is smaller value
		//Iterating through the array using looping control construct to find smallest number
		for(int x : array) { //using enhanced for loop because indexes are not required
			
			//Checking whether the array element is lesser than smallest or not
			if(x < smallest)
				smallest = x; 
		}
		
		System.out.println("The smallest value is "+smallest);
	}
}
