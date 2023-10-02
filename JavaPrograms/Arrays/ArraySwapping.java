import java.util.*;

public class ArraySwapping {
	public static void main(String arg[]) {

		// Creating scanner class object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		// Creating an int type array by reading array length from the user
		int array[] = new int[scan.nextInt()];
		// Taking the array elements from user
		for (int i = 0; i <= array.length - 1; i++)
			array[i] = scan.nextInt();
		System.out.println("Enter the two indexes to swap the values:");

		// The indexes of which values to be swap
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();

		// Closing scanner object
		scan.close();
		// Checking whether the indexes are valid or not
		if (index1 < 0 || index1 > array.length - 1 || index2 < 0 || index2 > array.length - 1)
			System.out.println("Enter the valid indexes");

		else {
			// Printing the array elements before swapping
			System.out.println("Elements Before swapping:");
			for (int x : array)
				System.out.print(x + " ");

			// Perform swapping on given indexes
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;

			// Printing the array elements after performing swapping
			System.out.println("\nElements After swapping:");
			for (int x : array)
				System.out.print(x + " ");

		}

	}
}
