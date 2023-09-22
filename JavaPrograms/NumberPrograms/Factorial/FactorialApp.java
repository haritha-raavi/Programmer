package com.learn.Factorial;
import java.util.*;
public class FactorialApp {

	public static void main(String[] args) {
		// Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		//Reading input from the user
		System.out.println("Enter the number");
		int userInput  =scan.nextInt();
		
		//calling findfact method from Factorial class
		Factorial.findFact(userInput);
	}

}
