import java.util.Scanner;

public class Test1
{
	public static void main(String arg[])
	{
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[] = new int[n];
		for(int i=0; i<n; i++)
		{
			ar[i]= sc.nextInt();
			sum+=ar[i];
		}
		sc.close();
		System.out.println("Average of marks "+sum/n);
	}
}
	