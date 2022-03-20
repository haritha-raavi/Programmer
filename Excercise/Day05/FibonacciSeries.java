import java.util.Scanner;

public class FibonacciSeries {
    int number;
    void series1(int num)
    {
        int a=0,b=1,temp=num/2;
        while(temp>0 )
        {
            System.out.print(a+" "+b+" ");
            a=a+b;
            b=a+b;
            temp--;
        }
        if(num%2==1)
          System.out.print(a);
    }
    void series2(int num){
        int a=0,b=1,c=1,temp=num/3;
        while(temp>0)
        {
            System.out.print(a+" "+b+" "+c+" ");
            a=a+b+c;
            b=a+b+c;
            c=a+b+c;
            temp--;
        }
        if(num%3==2)
            System.out.print(a+" "+b);
        else  if(num%3 == 1)
            System.out.print(a);
    }
    public static void main(String arg[])
    {
        Scanner sc =  new Scanner(System.in);
        FibonacciSeries s = new FibonacciSeries();
        s.number=sc.nextInt();
        sc.close();
        System.out.println("The Fibaonacci Series of two preceeding terms type:");
        s.series1(s.number);
        System.out.print("\nThe Fibaonacci Series of three preceeding terms type:\n");
        s.series2(s.number);
    }
    
}
