import java.util.Scanner;


public class Test2
{
	public static void main(String arg[])
	{       
		char c=' ';
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str.charAt(0).toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==" ")
				str.charAt(i+1).toUpperCase();
		}
	}
}	