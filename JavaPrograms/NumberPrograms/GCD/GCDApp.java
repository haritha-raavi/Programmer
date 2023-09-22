package com.learn.GCD;
import java.util.*;
public class GCDApp {

	public static void main(String[] args) {
		//Creating scanner class object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		//Reading two number from user
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		//Calling the findGcd method to find out the GCD
		GCD.findGcd(n1,n2);
	}

}
