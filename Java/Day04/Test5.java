// Program to find Prime Numbers...

import java.util.Scanner;
public class Test5
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		int count=0;
		int n=s.nextInt();
		s.close();
		for(int i=2; i<n/2; i++)
		{
			if (n % i == 0)
				count++;
		}
		
		if( count== 0)
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is NOT a prime number.");
	}
}


Sample Input 0  :  33
Sample Output 0 :  33 is NOT a prime number.

Sample Input 1 :  29
Sample Output 1:  29 is a prime number.