//PRG-2: End-of-File


import java.io.*;
import java.util.Scanner;

public class Test2
{
	public static void main(String arg[])
	{	
		String s="Hello world\nI am a file\nRead me until end-of-file";
		Scanner scan=new Scanner(s);
		for (int i=1; scan.hasNext(); i++ )
			System.out.println(i+ " "+scan.nextLine());
	}	
}


Sample Ouput 0:
1 Hello world
2 I am a file
3 Read me until end-of-file