//Pattern Program -14

import java.util.Scanner;

public class Test14
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=n; i>0;i--)
		{
			for (int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}

Sample Input 0:
5

Sample Output 0:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1