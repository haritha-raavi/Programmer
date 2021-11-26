// PRG-5: JAVA LOOPS

import java.util.*;
public class Test5
{ 
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value:");
		n=sc.nextInt();
		sc.close();
		System.out.println("The first 10 multiples of "+n);
		for(int i=1;i<=10;i++)
			System.out.println(n+" x "+i+" = "+(n*i));
	}
}   
			