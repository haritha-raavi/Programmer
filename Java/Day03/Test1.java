//PRG-1: Java DataTypes



import java.util.Scanner;
import java.io.*;

public class Test1
{
	public static void main(String []arg)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the no.of test cases:");
		int t=sc.nextInt();
		for(int i=0; i<t; i++)
		{
			try
			{
				long x=sc.nextLong();
				System.out.println(x+" Can be fitted in:");
				if (x>=-128 && x<=127)
					System.out.println("* byte");
				if (x>=-32768 && x<=32767)
					System.out.println("* short");
				if (x>=-2147483648 && x<=2147483647)
					System.out.println("* int");
				System.out.println("* long");
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}



Sample Input 0:
Enter the no.of test cases:5
-150 150000 1500000000 213333333333333333333333333333333 -1000000000000000


Sample Output 0:
-150 Can be fitted in:
* short
* int
* long
150000 Can be fitted in:
* int
* long
1500000000 Can be fitted in:
* int
* long
213333333333333333333333333333333 can't be fitted anywhere.
-1000000000000000 Can be fitted in:
* long