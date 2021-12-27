//PRG-4: Java -INT to STRING



import java.util.Scanner;

public class Test4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if (n>=-100 && n<=100)
		{	
				String s=n+" ";
				System.out.println("Good job");
		}
		else
			System.out.println("Wrong answer");
	}
}

/*

Sample Input 0:
0
Sample Output 0:
Good job



Sample Input 1:
989
Sample Output 1:
Wrong answer


*/