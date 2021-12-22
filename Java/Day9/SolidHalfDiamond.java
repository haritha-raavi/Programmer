//program to print the solid diamond...

import java.util.Scanner;

public class SolidHalfDiamond
{
    public static void printResult(int n)
    {
        for(int i=1; i<n/2; i++)
        {
                for(int j=i; j>=1; j--)
                    System.out.print("*");
            System.out.println();
        }
        for(int i=n/2; i<n; i++)
        {
                for(int j=i; j<n; j++)
                    System.out.print("*");
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