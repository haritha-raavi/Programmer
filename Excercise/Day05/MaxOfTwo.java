import java.util.Scanner;

public class MaxOfTwo {
    int a,b;
    MaxOfTwo(int n1,int n2) {
        a=n1;
        b=n2;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        MaxOfTwo o =new MaxOfTwo(sc.nextInt(),sc.nextInt());
        sc.close();
        System.out.println((o.a>o.b)?o.a+" is greater":o.b+" is greater");
    }
}
