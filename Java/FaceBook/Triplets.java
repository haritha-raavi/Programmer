import java.util.*;
public class Triplets{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 =scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1+num2+num3 == 0)
            System.out.println("The Triplets whose sum is zero are "+num1+" "+num2+" "+num3);
        else
            System.out.println("The Triplets "+num1+" "+num2+" "+num3+" sum is not zero");
    }
}