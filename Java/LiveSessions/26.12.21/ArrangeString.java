
import java.util.Scanner;
public class ArrangeString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        char ch[]= new char[str.length()];
        int x=0,y=str.length()-1;
        for(int i=0; i<str.length(); i++ )
        {
            if(str.charAt(i)=='0')
            {
                ch[x]=str.charAt(i);
                x++;
            }
            else
            {
                ch[y]=str.charAt(i);
                y--;
            }
        }
        System.out.println(ch);

    }
}
