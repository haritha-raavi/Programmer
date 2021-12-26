//Program fro fibonacci series


import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int a=1;
        int b=1;
        for(int i=0; i<n/2; i++)
        {
            System.out.print(a+" "+b+" ");
            a=a+b;
            b=a+b;
        }
    }
    
}

Sample input 0:
10

Sample output 0:
1 1 2 3 5 8 13 21 34 55
