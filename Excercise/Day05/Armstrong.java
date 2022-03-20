import java.util.Scanner;

public class Armstrong {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        sc.close();
        int temp=input;
        int sum=0;
        while(input>0)
        {
            sum+=Math.pow(input%10,3);
            input=input/10;
        }
        if(temp==sum)
            System.out.println("The number is armstrong.");
        else
        System.out.println("The number is not armstrong.");

    }
}
