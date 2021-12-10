//pattern programs:

import java.util.Scanner;

public class Test11
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int x=0;
		for(int i=0; i<n; i++)
		{	
			for(int k=0 ; k<n-i-1; k++)
				System.out.print(" ");	
			for (int j=0; j<=i+x; j++)			
				System.out.print("*");
			x++;
			System.out.println();
		}
	}
}

Sample Input 0:
5

Sample Output 0:
    *
   ***
  *****
 *******
*********