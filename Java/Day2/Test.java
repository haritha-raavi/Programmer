//Program-1: 


import java.util.*;
public class Test
{
	public static void main(String arg[])
	{
		double temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of queries:");
		int t=sc.nextInt();
		System.out.println("Enter the values of a,b,n:");
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			temp=0.0;
			for(int j=0;j<n;j++)
			{
				temp=temp+(Math.pow(2,j)*b);
				System.out.print(a+(int)temp+" ");
			}
			System.out.println();
		}
	}
}
