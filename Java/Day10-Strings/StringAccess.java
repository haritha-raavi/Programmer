//Accessing the string characters through "charAt()" method..


public class StringAccess {
    public static void main(String[] args) {
        String A="JavaProgramming";
        for(int i=0;i<A.length(); i++)  // Length() is a string method which returns length of the string
        {
            System.out.println(A.charAt(i));
        }
    }
    
}

/*

Sample Output:
J
a
v
a
P
r
o
g
r
a
m
m
i
n
g

*/