//program to print the hollow diamond...

import java.util.Scanner;

public class HollowDiamond
{
    public static void printResult(int n)
    {
        for(int i=1; i<=n/2; i++)
        {
                for(int k=n/2;k>i; k--)
                    System.out.print(" ");
                for(int j=i; j>=1; j--)
                {
                    if(j==i || j==1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            System.out.println();
        }
        for(int i=n/2; i<n; i++)
        {
            for(int k=i;k>n/2; k--)
                    System.out.print(" ");
                for(int j=i; j<n; j++)
                {
                    if(j==i || j==n-1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
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