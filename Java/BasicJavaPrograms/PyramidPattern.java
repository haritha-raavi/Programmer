import java.util.Scanner;

public class PyramidPattern {
    int rows;
    void printPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>i; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++) 
                System.out.print("* ");
            System.out.println();
        }
    }

    PyramidPattern(int n)
    {
        rows=n;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        PyramidPattern object = new PyramidPattern(sc.nextInt());
        sc.close();
        object.printPattern(object.rows);
    }
}
