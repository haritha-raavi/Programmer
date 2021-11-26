//PRG-3:  Java STDIN and STDOUT


import java.util.*;
public class Test3
{
	public static void main(String arg[])
	{
		int i;
		double d;
		String s;
		System.out.println("Enter the values:");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		d=sc.nextDouble();
		s=sc.nextLine(); 
		s=sc.nextLine();
		sc.close();
		System.out.println("String:"+s);
		System.out.println("Double:"+d);
		System.out.println("Int:"+i);
	}
}

		