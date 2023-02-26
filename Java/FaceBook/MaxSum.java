import java.util.*;
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        sc.close();
        int a = Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        if((a+b) > (a*b))
            System.out.println("The maximum sum value is "+(a+b));
        else
            System.out.println("The Maximum product value is "+(a*b));
    }
}
