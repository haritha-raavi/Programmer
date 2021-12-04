//PRG-3: Static initialized Block

import java.util.Scanner;
public class Test3
{
	static int breadth;
	static int height;
	static
	{
		Scanner s=new Scanner(System.in);
		breadth=s.nextInt();
		height=s.nextInt();
	}
	public static void main(String arg[])
	{
		if(height <=100 && breadth<=100 && height >=-100 && breadth>=-100)
		{
			if( height>0 && breadth>0)
				System.out.println(height*breadth);
			else
				System.out.println("java.lang.Exception:Breadth and Height must be positive");
		}
		else
			System.out.println("Invalid Input.");
	}
}

/*Sample inpute and outputs:

Test Case-1:
input:
989
5

ouput:Invalid Input.


Test Case-2:
input:
-99
0

ouput:
java.lang.Exception:Breadth and Height must be positive


Test Case-3:
input:
8
5

output:
40
*/