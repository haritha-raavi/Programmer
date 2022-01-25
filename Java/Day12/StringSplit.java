// String split method..
import java.util.Scanner;
public class StringSplit
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        String S =new String(scan.nextLine());
        String result[]=S.split("[!?, ._'@]");
        System.out.println(result.length);
        for(String i: result)
        System.out.println(i);
        scan.close();
    }
}

/*



Sample Input 0:
he is a very very good boy,isn't he?

Sample Output 0:
10
he
is
a
very
very
good
boy
isn
t
he

Sample Input 1:
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