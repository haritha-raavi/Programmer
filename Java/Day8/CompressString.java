// program to compress string..

import java.util.Scanner;
public class CompressString
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        scan.close();
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            int count=0;
            if(ch!='\0')
            {
                for(int j=i; j<str.length(); j++)
                {
                    if(ch==str.charAt(j))
                        count++;
                    else
                        break;
                }
                System.out.print(ch+""+count);
            }
            str=str.replace(ch,'\0');

        }
    }
}

/*
Sample Input -0
hhhhjjjjuuuaaannnfff

Sample Output -0
h4j4u3a3n3f3

*/