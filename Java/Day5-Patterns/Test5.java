// Pattern Programs-5:

import java.util.Scanner;

public class Test5
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		char c='A';
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
				System.out.print(c+" ");
			c++;
			System.out.println();
		}
	}
}



Sample Input 0:
5

Sample Output 0:
A
B B
C C C
D D D D
E E E E E
