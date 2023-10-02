import java.util.*;
public class Pattern28 {
	public static void printPattern(int n) {
		int temp=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2 != 0) {
					System.out.print(temp+" ");
					temp++;
				}
				else {
					System.out.print(temp+" ");
					temp--;
				}
			}
			System.out.println();
			if(i%2 != 0)
				temp = temp+n-1;
			else
				temp = temp+n+1;
		}
	}
	
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = scan.nextInt();
		scan.close();
		printPattern(rows);
	}
}
