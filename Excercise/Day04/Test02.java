import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        sc.close();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
