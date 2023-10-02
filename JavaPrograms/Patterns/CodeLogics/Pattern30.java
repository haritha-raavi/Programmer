import java.util.*;
public class Pattern30 {
	
	public static void printPattern(int n) {
		//First series
		int temp=1;
		{
			for(int i=1; i<=n; i++) {
				for(int k=1; k<=n-i; k++) {
					System.out.print("  ");
				}
				for(int j=1; j<=i; j++) {
					if(temp<10)
						System.out.print("0");
					System.out.print(temp+"  ");
					temp++;
				}
				System.out.println();
			}
		}
		//Second series
		{
			for(int i=2; i<=n; i++) {
				for(int k=1; k<=i-1; k++) {
					System.out.print("  ");
				}
				for(int j=1; j<=n-i+1; j++) {
					if(temp<10)
						System.out.print("0");
					System.out.print(temp+"  ");
					temp++;
				}
				System.out.println();
			}
		}
	}
	
	//main method
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		//Reading input from user
		System.out.println("Enter number of rows");
		int rows=scan.nextInt();
		scan.close();
		
		printPattern(rows);
	}
}
