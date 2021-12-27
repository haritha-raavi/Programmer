//pattern programs-10:

import java.util.Scanner;

public class Test10
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=0; i<n; i++)
		{	
			char c='A';
			for (int t=1;t<n-i;t++)
				c++;
			for(int k=0 ; k<n-i-1; k++)
				System.out.print(" ");	
			for (int j=0; j<=i;j++)	
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
    E
   D E
  C D E
 B C D E
A B C D E
