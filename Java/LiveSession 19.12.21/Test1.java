// Program to print the ascii value of specified character...
import java.util.Scanner;
public class Test1
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        System.out.print((int)ch);
    }
}