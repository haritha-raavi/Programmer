//String comparing methods
//equals(): it just return true if both the string contents are equal .
//equalsIgnoreCase(): it just return true if both the string contents are equal by ignoring case.
//compareTo : it compare two strings lexicographically.


public class StringCompare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        String s3 = "HELLO";
        String s4 = "world";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1==s2);


    }
    
}
