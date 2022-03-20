import java.util.Scanner;

public class SumOfDigits {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int userInput=sc.nextInt();
        sc.close();
        int sum=0;
        while(userInput>0) 
        {
            sum+=userInput%10;
            userInput=userInput/10;
        }
        System.out.println(sum);
    }
}
