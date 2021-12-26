//Program of printing primenumbers...

import java.util.Scanner;
public class PrimeNumbers
{
    public static void print(int start, int end)
    {
 
        for(int i=start; i<=end; i++)
        {
            int count=0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==0)
                System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int start=scan.nextInt();
        int end=scan.nextInt();
        scan.close();
        if(start!=1)
       print(start,end);
       else
       print(start+1,end);
    }
}

