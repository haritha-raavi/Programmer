//PRG-3:  Java STDIN and STDOUT


import java.util.Scanner;
public class Test3
{
	public static void main(String arg[])
	{
	
		System.out.println("Enter the values:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double d=sc.nextDouble();
		sc.nextLine(); 
		String s=sc.nextLine();
		sc.close();
		System.out.println("String:"+s);
		System.out.println("Double:"+d);
		System.out.println("Int:"+i);
	}
}


/*
Sample input-1:
Enter the values:
42
3.1324
Happy Learning..!

Sample output-1:
String:Happy Learning..!
Double:3.1324
Int:42	
*/	