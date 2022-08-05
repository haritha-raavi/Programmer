import java.util.Scanner;

public class SumAndProd {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int userInput=sc.nextInt();sc.close();
        int sum=0,r,prod=1;
        while(userInput>0)
        {
            r=userInput%10;
            sum+=r;
            prod*=r;
            userInput=userInput/10;
        }
        System.out.printf("Sum is %d\nProduct is %d",sum,prod);
    }
}
