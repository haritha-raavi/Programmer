//Pattern Program-15

import java.util.Scanner;

public class Test15
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i=n; i>0; i--)
		{
			int t=n;
			for(int j=1; j<=i; j++)
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
Sample Input 0:
5

Sample Output 0:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

Sample Input 1:
8

Sample Output 1:
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2
8 7 6 5 4 3
8 7 6 5 4
8 7 6 5
8 7 6
8 7
8