// program to find the cube for a given integer
import java.util.Scanner;
public class Test2
{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        double base=scan.nextDouble();
        double power=scan.nextDouble();
        scan.close();
        double result=Math.pow(base,power);
        System.out.println(result);
    }
}