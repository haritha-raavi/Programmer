import java.util.Scanner;

public class MinOfTwo {
    int a,b;
    MinOfTwo(int n1,int n2) {
        a=n1;
        b=n2;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        MinOfTwo o =new MinOfTwo(sc.nextInt(),sc.nextInt());
        sc.close();
        System.out.println((o.a<o.b)?o.a+" is smaller":o.b+" is smaller");
    }
}

