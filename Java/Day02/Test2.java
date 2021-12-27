//Program-1: 


import java.util.*;
public class Test2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of queries:");
		int t=sc.nextInt();
		System.out.print("Enter the values of a,b,n:");
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


/*

Sample input-0:
Enter no of queries:1
Enter the values of a,b,n:2 4 7

Sample Output-0:
6 14 30 62 126 254 510