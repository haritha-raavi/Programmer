import java.util.Scanner;

public class RPyramidPattern {
    int rows;
    void printPattern(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n; j>i; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++) 
                System.out.print("* ");
            System.out.println();
        }
    }

    RPyramidPattern(int n)
    {
        rows=n;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        RPyramidPattern object = new RPyramidPattern(sc.nextInt());
        sc.close();
        object.printPattern(object.rows);
    }
}
