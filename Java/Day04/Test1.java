//Program on Strings...


import java.util.Scanner;
public class Test1
{

    public static String convert(String s)
    {
        String result=s.substring(0,1);
        result=result.toUpperCase();
        return result+s.substring(1,s.length());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A=scan.nextLine();
        String B=scan.nextLine();
        scan.close();
        System.out.println(A.length()+B.length());
        for(int i=0; i<A.length(); i++)
        {
            if(A.charAt(i)==B.charAt(i))
                continue;
            else 
            {
                if(A.charAt(i)>B.charAt(i))
                {
                  System.out.println("YES");
                  break;
                }
                else
               {
                System.out.println("NO");
                break;
               }
            }
        }
        System.out.println(convert(A)+" "+convert(B));
    }
}

/*
Sample Input 0:
hello
arya

Sample Output 0:
9
YES
Hello Arya

Sample Input 1:
hello
java

Sample Output 1:
9
NO
Hello Java

*/