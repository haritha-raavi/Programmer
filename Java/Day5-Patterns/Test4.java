//Pattern programs-4:

import java.util.Scanner;
public class Test4
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}

Sample Input 0 :
5

Sample Output 0:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5