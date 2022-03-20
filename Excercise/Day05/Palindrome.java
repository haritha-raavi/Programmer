import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome(int num) {
        int temp=num,sum=0;
        while(num>0)
        {
            sum=sum*10+num%10;
            num=num/10;
        }
        if(sum == temp)
            return true;
        else
            return false;
    }

    public static void main(String arg[]){ 
        Scanner sc = new Scanner(System.in);
        int userValue=sc.nextInt();
        sc.close();
        if(isPalindrome(userValue))
            System.out.println(userValue+" is a palindrome");
        else
            System.out.println(userValue+" is not a palindrome");
    }
}
