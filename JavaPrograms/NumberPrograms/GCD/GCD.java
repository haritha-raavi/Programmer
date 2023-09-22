package com.learn.GCD;

public class GCD {
	//Euclidians Algorithm
	public static void findGcd(int m, int n) {
		int rem;
		int org1 = m, org2 =n;
		while(n != 0) {
			rem = m%n;
			m = n;
			n = rem;
		}
		System.out.println("The GCD of "+org1+" "+org2+" is "+m);
	}
}
