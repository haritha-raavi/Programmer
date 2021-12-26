//Program fro fibonacci series


import java.util.Scanner;
public class FibonacciSeries2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int a=0,b=1,c=1;
        for(int i=0; i<n/3; i++)
        {
            System.out.print(a+" "+b+" "+c+" ");
            a=a+b+c;
            b=a+b+c;
            c=a+b+c;
        }
    }
    
}


Sample input 0:
10
sample output 0;
0 1 1 2 4 7 13 24 44 68