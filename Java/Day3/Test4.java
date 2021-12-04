//PRG-4: Java -INT to STRING



import java.util.Scanner;

public class Test4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>=-100 && n<=100)
		{	
				String s=n+" ";
				System.out.println("Good job");
		}
		else
			System.out.println("Wrong answer");
	}
}

/*Sample inputs and outputs:

Test Case-1:
input:
0
output:
Good job


Test Case-2:
input:
989
output:
Wrong answer

*/