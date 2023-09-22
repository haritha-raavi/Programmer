package com.learn.FibonacciSeries;
import java.util.*;
public class FibonacciSeriesApp {
	//Main method
	public static void main(String arg[]) {
		//Creating object for the scanner class
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		//Reading user input
		int  n = scan.nextInt();
		
		
		//Closing scanner object
		scan.close();
		
		FibonacciSeries.printFib(n);
	}
}
