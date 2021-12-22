//program to count character in the given string
import java.util.*;
public class Test3
{
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        char ch[] = scan.nextLine().toCharArray();
        scan.close();
        Arrays.sort(ch);
        String str = new String(ch);
        for(int i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            int count=0;
            if(c =='\0')
               continue;
            else
            {
               for(int j=0; j<str.length(); j++)
               {
                    if(c==(str.charAt(j)))
                       count++;
               }
               System.out.println(str.charAt(i)+" occurs "+count+" times");

               str=str.replace(c , '\0');
            }
        }
    }
 
}