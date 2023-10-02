import java.util.*;
public class Merging {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		//Reading array 1 length
		int array1[] = new int[scan.nextInt()];
		System.out.println("Enter the array 1 elements:");
		//Reading array1 elements from the user
		for(int i=0; i<=array1.length-1; i++){
			array1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the size of array 2");
		//Reading array two length
		int array2[] = new int[scan.nextInt()];
		System.out.println("Enter the array 2 elements:");
		//Reading array2 elements from the user
		for(int i=0; i<=array2.length-1; i++){
			array2[i] = scan.nextInt();
		}
		
		//Creating an array to store the merging result
		int array3[] = new int[array1.length+array2.length];
		
		//Copying first array elements into third array
		for(int i=0; i<=array1.length-1; i++) {
			array3[i] = array1[i];
		}
		
		//Copying second array elements
		int j=0; //The variable to maintain array2 index
		for(int i= array1.length; i<=array3.length-1; i++) {
			array3[i] = array2[j];
			j++;
		}
		
//		//Copying second array elements - second method
//		int j=array1.length; //The variable to maintain array3 index
//		for(int i= 0; i<=array2.length-1; i++) {
//			array3[j] = array2[i];
//			j++;
//		}		
		
		//Displaying array1 elements
		System.out.println("Array 1 elements are:");
		for(int i : array1)
			System.out.print(i+" ");
		
		System.out.println(); //To send cursor to new line
		//Displaying array2 elements
		System.out.println("Array 2 elements are:");
		for(int i : array2)
			System.out.print(i+" ");

		System.out.println(); //To send cursor to new line
		//Displaying array3 elements
		System.out.println("Array 3 elements are:");
		for(int i : array3)
			System.out.print(i+" ");
	}
}
