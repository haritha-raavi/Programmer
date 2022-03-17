import java.util.Scanner;

public class Test03 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();sc.close();
        sc.close();
        int t=1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}
