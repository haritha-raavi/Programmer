//Pattern Program-17

import java.util.Scanner;
public class Test17
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int t=1;
		for(int i=1; i<=n; i++)
 		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
	}
}

Sample Input 0:
5

Sample Output 0:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
