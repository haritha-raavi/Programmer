package com.learn.SumInSingleDigit;

import java.util.Scanner;

public class SumInSingleDigitApp {

	public static void main(String[] args) {
		//CReating scanner object
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number:");
				int userInput = scan.nextInt();
				scan.close();
				SumInSingleDigit.calculateSum(userInput);
	}

}
