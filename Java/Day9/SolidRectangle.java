// program to print the solid rectangle using stars(*)...

import java.util.Scanner;
public class SolidRectangle
{
    public static void printResult(int rows,int columns)
    {
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=columns; j++)
                System.out.print("* ");
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
