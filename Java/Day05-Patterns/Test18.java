//Program Pattern-18

import java.util.Scanner;

public class Test18
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for (int i=n;i>0;i--)
		{
			char c='A';
			for(int j=0; j<i; j++)
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
A B C D E
A B C D
A B C
A B
A