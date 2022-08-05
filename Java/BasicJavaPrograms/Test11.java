// Program to arranging gift boxes in order so that the number of gift boxes is equal 
// to row number
import java.util.Scanner;
public class Test01
{
    public static void printPattern(int n)
    {
        int k=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        printPattern(n);
    }    
}

/** 
 Sample input :
 10

 
 Sample output:
 1 
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31 32 33 34 35 36
 37 38 39 40 41 42 43 44 45 
 46 47 48 49 50 51 52 53 54 55

*/