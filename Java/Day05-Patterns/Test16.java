//Pattern Program-16

import java.util.Scanner;

public class Test16
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i=1;i<=n;i++)
		{
			int t=n;
			for(int j=1;j<=i;j++)
			{
				System.out.print(t+" ");
				t--;
			}
			System.out.println();
		}
	}
}

Sample Input 0:
5

Sample Output 0:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1