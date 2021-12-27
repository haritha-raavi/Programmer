// Pattern Program-19

import java.util.Scanner;
public class Test19
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
		for(int i=n;i>0;i--)
		{
			char ch=c;
			for(int j=0;j<i;j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}


Sample Input 0:
5

Sample Output 0:
E D C B A
E D C B
E D C
E D
E

Sample input 1:
8

Sample output 1:
H G F E D C B A
H G F E D C B
H G F E D C
H G F E D
H G F E
H G F
H G
H	
