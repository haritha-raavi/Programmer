import java.util.Scanner;

public class LeapYear {
    int year;
    boolean isLeapYear(int number) {
        if(number % 4 ==0)
           return true;
        else
            return false;
    }
    LeapYear(int year)
    {
        this.year=year;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        LeapYear obj = new LeapYear(sc.nextInt());
        sc.close();
        if(obj.isLeapYear(obj.year))
            System.out.println(obj.year+" is a leap number");
        else
            System.out.println(obj.year+" is not a leap year");
    }
}
