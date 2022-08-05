import java.util.*;

public class FloatType {

    public static void main(String arg[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        float floatValue = sc.nextFloat();
        sc.close();
        System.out.println("Smaller integer of "+floatValue+" is "+Math.ceil(floatValue));
        System.out.println(floatValue);
        System.out.println("Larger integer of "+floatValue+" is "+Math.floor(floatValue));
    }


}
