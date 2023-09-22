package com.learn.Palindrome;
import java.util.*;
public class PalindromeApp {
	public static void main(String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int userInput = scan.nextInt();
		scan.close();
		Palindrome.isPalindrome(userInput);
	}
}
