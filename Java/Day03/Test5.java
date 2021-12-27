import java.util.*;
import java.text.*;
public class Test5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment= scan.nextDouble();
        scan.close();
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india= NumberFormat.getCurrencyInstance(new Locale("en"));
        System.out.println("US: "+us.format(payment));
        System.out.println("India: "+india.format(payment));
        System.out.println("China : "+china.format(payment));
        System.out.println("France: "+france.format(payment));
    }
}

/*

Sample input :
12324.123

Sample Output:
US: $12,324.12
India: Rs.12,324.12
China : ¥12,324.12
France: 12 324,12 ?
*/