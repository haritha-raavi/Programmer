//pattern programs-9:

import java.util.Scanner;

public class Test09
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=1; i<=n; i++)
		{	
			char c='A';
			for(int k=1 ; k<=n-i; k++)
				System.out.print(" ");	
			for (int j=1; j<=i; j++)
			{			
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}



Sample Input 0:
5

Sample Output 0:
    A
   A B
  A B C
 A B C D
A B C D E

