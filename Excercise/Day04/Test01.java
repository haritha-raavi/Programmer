import java.util.Scanner;

public class Test01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String s[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(year % 4 == 0)
            a[1]+=1;
        System.out.println(s[month-1]+" "+year+" has "+a[month-1]+" days");
    }
}