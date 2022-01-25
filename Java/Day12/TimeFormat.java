import java.util.Scanner;
public class TimeFormat
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String result="";
        if(s.charAt(8)=='A')
        {
            if(s.charAt(0)=='1' && s.charAt(1)=='2')
            {
                result="00"; 
                System.out.println(result+s.substring(2,10));              
            }
            else
                System.out.println(s.substring(0,10));
        }
        else
        {
            if(s.charAt(0)=='1' && s.charAt(1)=='2')
            {
                System.out.println(s.substring(0,10));
            }
            else
            {
                  int time=s.charAt(0)-'0';
                 time+=time*10+s.charAt(1)-'0';
                 time+=12;
                 System.out.println(time+s.substring(2,10));
            }
        }




    }
}