
import java.util.*;
public class StringRegex {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        System.out.println(input.matches("[a-zA-Z]+[0-9]+"));

    }
}
