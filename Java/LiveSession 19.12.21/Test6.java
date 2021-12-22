//program to reverse a number
import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        int sum=0,rem;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scan.nextInt();
        scan.close();
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;

        }
            System.out.println("The reversed number is "+sum);
    }
    
}
