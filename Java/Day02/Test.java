//Program-1: To Print the Series:


import java.util.Scanner;
public class Test
{
	public static void main(String arg[])
	{
		double temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of queries:");
		int t=sc.nextInt();
		System.out.print("Enter the values of a,b,n:");
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


/*
Sample input-1:
Enter no of queries:2
Enter the values of a,b,n:0 2 10 5 3 5

Sample Output-1:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/