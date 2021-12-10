//pattern programs:

import java.util.Scanner;

public class Test8
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=0; i<n; i++)
		{	
			int t=n-i;
			for(int k=0 ; k<n-i-1; k++)
				System.out.print(" ");	
			for (int j=0; j<=i;j++)	
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
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5