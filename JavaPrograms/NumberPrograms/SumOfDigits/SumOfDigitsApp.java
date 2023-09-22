
package com.learn.SumOfDigits;
import java.util.*;

public class SumOfDigitsApp {

	public static void main(String[] args) {
	
		//CReating scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int userInput = scan.nextInt();
		scan.close();
		SumOfDigits.findSum(userInput);
	}

}
