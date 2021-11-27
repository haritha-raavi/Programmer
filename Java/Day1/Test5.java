// PRG-5: JAVA LOOPS

import java.util.Scanner;
public class Test5
{ 
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Value:");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}   


/*
Sample input-1:
Enter a value:8

Sample output-1:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80	

*/		