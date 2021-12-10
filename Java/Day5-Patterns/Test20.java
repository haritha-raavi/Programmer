//Pattern Program -20

import java.util.Scanner;

public class Test20
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int t=n-1;
		char c='A';
		while(t>0)
		{
			c++;
			t--;
		}
		for (int i=0;i<n; i++)
		{
			char ch=c;
			for (int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}


Sample input 0:
5

Sample Output 0:
E
E D
E D C
E D C B
E D C B A

Smaple input 1:
7

Sample output 1:
G
G F
G F E
G F E D
G F E D C
G F E D C B
G F E D C B A
