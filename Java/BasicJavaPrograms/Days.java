import java.util.Scanner;

public class Days {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        sc.close();
        System.out.println("Months = "+(days/30)+"\nDays = "+(days%30));
    } 
}
