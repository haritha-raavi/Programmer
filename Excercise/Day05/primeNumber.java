import java.util.Scanner;

public class primeNumber {
    static void generate(int limit)
    {
        for(int i=2; i<limit; i++)
        {
            int count=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                    count++;
            }
                if(count==2)
                    System.out.print(i+" ");
        }

    }
    
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();
        sc.close();
        generate(range);
        
    }
}
