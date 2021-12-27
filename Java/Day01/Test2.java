//PRG-2: Conditional Check


import java.util.Scanner;
public class Test2
{
	public static void main(String[] arg)
	{
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		if(num>=1 && num<=100)		
		{
			if(num % 2 != 0)
			    System.out.println("Weird");
			else
			    if(num < 5)
				System.out.println("Not Weird");
			    else
				if(num < 20)
				   System.out.println("Weird");
				else
				   System.out.println("Not Weird");			
		}
		else
			System.out.println("Invalid Input.");
	}
} 



/*

Sample input-1:
Enter a number:89

Sample output-1:
Weird



Sample input-2:
Enter a number:896

Sample output-2:
Invalid Input.



Sample input-3:
Enter a number:18

Sample output-3:
Weird		



Sample input-4:
Enter a number:-17

Sample output-4:
Invalid Input.



Sample input-5:
Enter a number:4

Sample output-5:
Not Weird



Sample input-6:
Enter a number:24

Sample output-6:
Not Weird

*/