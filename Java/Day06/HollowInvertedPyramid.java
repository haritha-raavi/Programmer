import java.util.Scanner;

public class HollowInvertedPyramid
{
	public static void printPattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
			   if(i!=1)
			   {
				if(j!=n && j!=i)
					System.out.print("  ");
				else
					System.out.print(j+" ");
			    }
			    else
				System.out.print(j+" ");
			}

			
			System.out.println();
		}
	}
	
	
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		printPattern(n);
	}
}

Sample input 0:
5
Sample output 0:
1 2 3 4 5
2     5
3   5
4 5
5

sample input 1:
7
Sample output 1:
1 2 3 4 5 6 7
2         7
3       7
4     7
5   7
6 7
7