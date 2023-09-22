package com.learn.Palindrome;

public class Palindrome {
	public static void isPalindrome(int num) {
		int org = num;
		int rev=0; // to store the reverse number of original number
		while(num != 0) {
			rev=rev*10+num%10;
			num/=10;
		}
		//Checking if both reverse number and original number are same or not.
		if(rev == org)
			System.out.println("The number "+org+" is palindrome");
		else
			System.out.println("The number "+org+" is not a palindrome");
	}
}
