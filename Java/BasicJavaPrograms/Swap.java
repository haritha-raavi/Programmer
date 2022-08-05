import java.util.Scanner;

public class Swap {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.close();
        System.out.println("Before swapping : num1="+num1+" num2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.print("After swapping : num1="+num1+" num2="+num2);
    }
}
