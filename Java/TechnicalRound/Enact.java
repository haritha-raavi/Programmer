import java.util.*;
public class Enact{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0; i<size; i++)
			a[i] = sc.nextInt();

		sc.close();
		int count=0;
		for(int i=1; i<size-1; i++)
			if(a[i] != a[i+1] || a[i] != a[i-1])
				count++;
		if(a[0] != a[1])
			 count++;
		if(a[size-1] != a[size-2])
			 count++;

		System.out.print(count);
	}
}