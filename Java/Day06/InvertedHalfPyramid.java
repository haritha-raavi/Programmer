import java.util.Scanner;

public class InvertedHalfPyramid
{
	public static void printPattern(int n)
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
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
1 2 3 4
1 2 3
1 2
1


Sample input 1:
8
Sample output 1:
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
