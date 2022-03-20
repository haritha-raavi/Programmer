import java.util.Scanner;

public class Average
{
    public static void main(String ar[]){
        int evenSum=0,oddSum=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        sc.close();
        while(n>0)
        {
            if(i%2==0)
            {
                evenSum+=i;
                n--;
            }
            i++;
        }
        i--;
        while(i>0)
        {
            if(i%2 !=0)
                oddSum+=i;
            i--;
        }


        System.out.println("Average = "+(double)(evenSum+oddSum)/2);
    }
}