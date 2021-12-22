// Program to find a character in the given string
import java.util.Scanner;

public class Test5 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    char ch =scan.next().charAt(0);
    scan.close();
    int count=0;
    for(int i=0; i<str.length(); i++)
    {
        if(ch==str.charAt(i))
            count++;
    }
    if(count!=0)
        System.out.println(count);
    else
        System.out.println("character not found");
}    
}
