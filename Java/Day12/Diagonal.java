//Finding the diagonal difference in a square matrix.. 
import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int arr[][]= new int[size][size];
        int D1=0,D2=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        scan.close();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                   if(i==j)
                      D1+=arr[i][j];
            }
        }
        for(int i=0; i<size; i++)
        {
            D2+=arr[i][size-i-1];
        }
        if(D1>D2)
        {
            System.out.println(D1-D2);
        }
        else
        System.out.println(D2-D1);
    }
}

/*

Sample input 0:
3
11 2 4
4 5 6
10 8 -12

Sample output 0:
15


*/