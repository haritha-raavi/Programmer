package com.learn.Factorial;

public class Factorial {
	public static void findFact(int n) {
		if(n<0)
			System.out.println("Factorial is not for negative numbers");
		else if(n==0)
			System.out.println("The factorial value is 1");
		else {
			//Create variable to store the result
			int sum=1;
			while(n>0) {   // Multiple until n value becomes zero
				sum*=n;		//Multiply the present value of n to te previous sum value;
				n--;		//reducing n value one
			}
			System.out.println("The factorial value "+sum);
		}
	}
}
