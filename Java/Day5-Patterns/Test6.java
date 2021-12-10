//pattern programs-6:

import java.util.Scanner;

public class Test6
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=1; i<=n; i++)
		{	
			for(int k=1 ; k<=n-i; k++)
				System.out.print("  ");	
			for (int j=1; j<=i; j++)			
				System.out.print("* ");
			System.out.println();
		}
	}
}


Sample Input 0: 
5

Sample Output 0:
        *
      * *
    * * *
  * * * *
* * * * *
