import java.util.Scanner;

public class NumberPyramid {
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++){
            for(int k=n; k>i; k--)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }     

    static void RPattern(int n)
    {
        for(int i=n; i>=1; i--){
            for(int k=n; k>i; k--)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
    } 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        sc.close();
        System.out.println("First One:");
        pattern(rows);
        System.out.println("\n\n\nSecond One:");
        RPattern(rows);
    }
}
