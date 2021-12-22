import java.util.Scanner;

public class HalfPyramid
{
	public static void printPattern(int n)
	{
		for(int i=1; i<=n; i++)
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
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


Sample input 1:
10
Sample Output 1:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10
