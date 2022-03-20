import java.util.Scanner;

public class TrainglePattern {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        sc.close();
        int temp=1;
        for(int i=0;i <rows; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print(temp+++" ");
            System.out.println();
        }
    }
}
