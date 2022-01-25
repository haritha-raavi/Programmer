//Program for spliting the string for the specified delimiters...

import java.util.Scanner;
public class StringSplit2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        scan.close();
        int x=0;
        String result[]=new String[S.length()];
        String s="";
        for(int i=0; i<S.length(); i++)
        {
            if(Character.isLetter(S.charAt(i)))
            {
                s+=S.charAt(i);
            }
            else
            {
                result[x]=s;
                x++;
                s="";
            }

            
        }
        if(s!="")
        {
        result[x]=s;
        x++;
        }
        System.out.println(x);
        for(int i=0;i<x;i++)
            System.out.println(result[i]);
    }
}


/*

Sample Input 0:
He is a very very good boy,isn't he?  

Sample Output 0:
10
He
is
a
very
very
good
boy
isn
t
he

Sample input 1:
hii,hello java_world!Programming@language

Sample Output 1:
6
hii
hello
java
world
Programming
language

*/