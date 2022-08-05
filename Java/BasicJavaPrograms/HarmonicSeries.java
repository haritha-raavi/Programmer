import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        double result=0.0;
        while(a>0)
        {
            result+=(double)1/a;
            a--;
            System.out.print(result+" ");
        }
    }
}
