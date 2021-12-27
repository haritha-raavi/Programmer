// program to print the hollow rectangle using stars(*)...

import java.util.Scanner;
public class HollowRectangle
{
    public static void printResult(int rows,int columns)
    {
        for(int i=1; i<=rows; i++)
        {
            if(i==1 || i==rows)
            {
                for(int j=1; j<=columns; j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int k=1; k<=columns; k++)
                {
                    if(k==1 || k==columns)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows and columns count:");
        int rows =scan.nextInt();
        int columns=scan.nextInt();
        scan.close();
        printResult(rows,columns);
    }
}


/*
Sample Input :
Enter rows and columns count: 3 5
Sample Output:
* * * * *
*       *
* * * * *


*/