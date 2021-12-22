import java.util.Scanner;

public class HollowHalfPyramid
{
	public static void printPattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
			   if(i!=n)
			   {
				if(j!=1 && j!=i)
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

Sample Output 0:
1
1 2
1   3
1     4
1 2 3 4 5


Sample input 1:
9

Sample output 1:
1
1 2
1   3
1     4
1       5
1         6
1           7
1             8
1 2 3 4 5 6 7 8 9

