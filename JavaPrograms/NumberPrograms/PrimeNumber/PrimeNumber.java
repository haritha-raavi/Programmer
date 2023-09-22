package com.learn.PrimeNumber;

public class PrimeNumber {
	public static void isPrime(int n) {
		//Loop to find factors other than 1 and itself
		for(int i=2; i<=n-1; i++)
			//checking present number is a factor of n or not
			if(n%i == 0) {
				System.out.println(n+" is not a prime number");	//If we a find a factor then its not a prime
				return;			//Returning control to the JVM
			}
		System.out.println(n+" is a prime number");
	}
}
