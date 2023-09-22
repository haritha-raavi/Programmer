package com.learn.Armstrong;

public class Armstrong {
	public static void isArmstrong(int n) {
		int count=0;
		int original = n;
		//the loop is to find out the number of digits in the number and store it into the count variable
		while(n != 0) {
			count++;
			n/=10;
		}
		
		int sum = 0;
		n = original;
		//Finding the each digit and multiply itself by count number of times and add to sum variable
		while(n != 0) {
			int rem = n%10;				//Finding remainder that is last digit of the number
			int value=1;
			
			//loop is to multiplying the digit itself by count number of times
			for(int i=1; i<=count; i++) {
				value *=rem;
			}
			sum+=value;
			n/=10;					//removing last digit from the number
		}
		//Checking whether the sum value is equal to original user input
		if(sum == original)
			System.out.println(original+" is a ArmStrong number");
		else
			System.out.println(original+" is not a armstrong number");
	}
}
