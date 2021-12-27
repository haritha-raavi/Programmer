// Program to find palindrome string:

import java.util.Scanner;
public class Test4
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		String A=s.nextLine();
		for (int i=0;i<A.length(); i++)
		{
			if(A.charAt(i)==A.charAt((A.length()-1)-i))
			{
				if(i==(A.length()-1))
					System.out.println("YES");
				else 
					continue;
			}
			else
			{
				System.out.println("NO");
			        break;
			}
		}
	}
}	



Sample Input  0 : madam
Sample Output 0 : YES

Sample Input  1 : test
Sample Output 1 : NO

Sample Input  2 : 888
Sample Output 2 : YES

Sample Input  3 : 879
Sample Output 3 : NO
