import java.util.Scanner;

public class FullPyramid
{
	public static void printPattern(int n)
	{
		int temp=0;
		for(int i=1; i<=n; i++)
		{
			for(int k=i; k<n; k++)
				System.out.print("  "); 
			for(int j=1; j<=i; j++)
			{
				temp++;
				System.out.print(temp+" ");
			}
			for(int x=1; x<i; x++)
			{
				temp--;
				System.out.print(temp+" ");
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
5
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5