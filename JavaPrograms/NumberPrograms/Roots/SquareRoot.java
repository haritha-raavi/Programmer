package com.learn.Roots;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		//Reading user input
		int num = scan.nextInt();
		double result= Math.sqrt(num);  //Find square root using inbuilt method sqrt() present in Math class
		System.out.println("The square root of "+num+" is "+result);
	}

}
