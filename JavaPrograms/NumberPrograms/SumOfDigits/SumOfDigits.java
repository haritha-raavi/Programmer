package com.learn.SumOfDigits;

public class SumOfDigits {
	public static void findSum(int n) {
		int sum=0;
		int temp = n;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		System.out.println("The sum of digits of "+temp+" is "+sum);
	}
}
