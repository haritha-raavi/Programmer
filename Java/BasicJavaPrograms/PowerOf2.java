import java.util.Scanner;

public class PowerOf2 {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int pow=sc.nextInt();sc.close();
    int result=1;
    for(int i=1; i<=pow; i++)
    result*=2;
    System.out.println(result);
    }
}
