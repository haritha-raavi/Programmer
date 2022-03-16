import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                arr[i][j]=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
            {
                if(i<=j)
                sum+=arr[i][j];
            }
        System.out.println("Sum = "+sum);
    }
}
/**
Sample input:
3
1 2 3
4 5 6
7 8 9

Sample output
Sum = 26

*/