package com.learn.SumInSingleDigit;

public class SumInSingleDigit {
	public static void calculateSum(int n) {
		int org = n;
		int sum=0;
			while(n != 0) {
				sum+=n%10;
				n/=10;
			}
			if(sum >= 10)
				calculateSum(sum);
			else
				System.out.println("The sum until single digit is "+sum);
	}
}
