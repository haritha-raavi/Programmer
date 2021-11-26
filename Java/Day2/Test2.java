//Program-1: 


import java.util.*;
public class Test2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of queries:");
		int t=sc.nextInt();
		System.out.println("Enter the values of a,b,n:");
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				a+=(Math.pow(2,j)*b);
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
