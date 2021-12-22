//program to print the solid diamond...

import java.util.Scanner;

public class SolidDiamond
{
    public static void printResult(int n)
    {
        for(int i=1; i<=n/2; i++)
        {
                for(int k=n/2;k>i; k--)
                    System.out.print(" ");
                for(int j=i; j>=1; j--)
                    System.out.print("* ");
            System.out.println();
        }
        for(int i=n/2; i<n; i++)
        {
            for(int k=i;k>n/2; k--)
                    System.out.print(" ");
                for(int j=i; j<n; j++)
                    System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        printResult(n);
    }
}