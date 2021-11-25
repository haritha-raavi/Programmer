//PRG-2: Conditional Check


import java.util.*;
public class Test2
{
	public static void main(String[] arg)
	{
		System.out.println("Enter a number in between 1 to 100:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();

		if(n%2 != 0)
		{
			System.out.println("Weird");
		}
		else
		{
			if(n<5)
				System.out.println("Not Weird");
			else
			{
				if(n<20)
					System.out.println("Weird");
				else
					System.out.println("Not Weird");
			}
		}
	}
}
		