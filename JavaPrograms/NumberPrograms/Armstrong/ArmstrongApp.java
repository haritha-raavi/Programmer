package com.learn.Armstrong;
import java.util.*;
public class ArmstrongApp {

	public static void main(String[] args) {
		// Creating object for the scanner class
		Scanner scan = new Scanner(System.in);
		//Reading input from the user
		System.out.println("Enter the number");
		int userInput  =scan.nextInt();
		
		//calling isArmstrong method from Armstrong class
		Armstrong.isArmstrong(userInput);
	}

}
