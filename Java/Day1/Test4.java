//PRG - 4: Java STDIN and STDOUT


import java.util.*;
public class Test4
{
   	 public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for (int i=0;i<3;i++)
		{ 
			String s=sc.next();
			String x=sc.next();
			if(s.length()<8)
		 	  System.out.print(s+"\t\t");
			else
		   	System.out.print(s+"\t");
			if(x.length()<3)
			{
				if(x.length()<2)
					System.out.println("00"+x);
				else
					System.out.println("0"+x);
			}
			else
				System.out.print(x);
			
		}
		sc.close();
  	 }
}
	
       


