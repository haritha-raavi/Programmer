//initializing the string in different ways..

public class StringIntialization
{
    public static void main(String[] args) {
        String s1="hello";// declaring a string literal.

        String s2=new String(s1); // String constructor.
        char ch[]={'J','A','V','A'};
        String s3=new String(ch);// Using character array.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}


/*

Sample Output:
hello
hello
JAVA

*/