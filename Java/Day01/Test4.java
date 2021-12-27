//PRG - 4: Print Formatters


import java.util.Scanner;
public class Test4
{
   	 public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		for (int i=0;i<3;i++)
		{ 
			String s=sc.next();
			int x=sc.nextInt();
			if(s.length()<=10 && x>=0 && x<=999)
				System.out.printf("%-15s%03d\n",s,x);
			else
				System.out.println("Invalid Input.");
		}	
		sc.close();
  	 }
}
	
/*   
    
Sample Input-1:
Enter the values:
hari 3 harii 34 hariii 345

Sample Output-1:
hari           003
harii          034
hariii         345



Sample Input-2:
Enter the values:
haritharaavi 3 hari 678 haritha 1001

Sample Output-2:
Invalid Input.
hari           678
Invalid Input.

*/