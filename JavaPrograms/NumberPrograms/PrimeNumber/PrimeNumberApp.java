package com.learn.PrimeNumber;
import java.util.*;
public class PrimeNumberApp {

	public static void main(String[] args) {
		//Taking user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check whether prime or not");
		int userInput = scan.nextInt();
		
		scan.close();
		//Calling isPrime method
		PrimeNumber.isPrime(userInput);
	}

}
