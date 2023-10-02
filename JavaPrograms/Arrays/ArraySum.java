import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Reading input from the user
		System.out.println("Enter the length of the array:");
		int array[] = new int[scan.nextInt()];
		System.out.println("Enter the array elements:");
		for(int i=0; i<=array.length-1; i++)
			array[i] = scan.nextInt();
		int sum=0;
		
		//Iterating through the loop for finding the sum
		for(int x: array) //Enhanced for loop
			sum+=x;
		System.out.println("The sum of array elements is:"+sum);
	}

}
