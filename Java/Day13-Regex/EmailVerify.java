/** Program to verify the valid email without using regex...
    We use the string methods in the following one..  */

import java.util.Scanner;

public class EmailVerify        
{
    public boolean check(String mail)
    {
        if(!mail.contains("@"))
            return false;
        else if(!mail.contains("_"))
            return false;
        else if(!mail.contains(".org"))
            return false;
        else
        {
            int indexOfChar=mail.indexOf("_");
            int indexOfSymbol=mail.indexOf("@");
            int indexOfDot=mail.indexOf(".");
            String first=mail.substring(0,indexOfChar);
            String last=mail.substring(indexOfChar+1,indexOfSymbol);
            String word=mail.substring(indexOfSymbol+1,indexOfDot);
            if(!(first.length()>=1 && last.length()>=1 && word.length()>=1 ))
                 return false;
        }  

        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String mail=sc.nextLine();
        sc.close();
        EmailVerify obj = new EmailVerify();
        if(obj.check(mail))
            System.out.println("Valid MAIL");
        else
            System.out.println("Invalid MAIL");

    }
}

/** 
Sample Input 0:
haritha_raavi@10.org

Sample Output 0:
Valid MAIL

Sample input 1:
hari_@10.org

Sample output 1:
Invalid MAIL

*/