package com.learn.Roots;
import java.util.*;
public class CubeRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		//Reading user input
		int num = scan.nextInt();
		double result= Math.cbrt(num);  //Find square root using inbuilt method cbrt() present in Math class
		System.out.println("The cube root of "+num+" is "+result);
	}

}
