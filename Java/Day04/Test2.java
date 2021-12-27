//Program on substrings...

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        int start=scan.nextInt();
        int end = scan.nextInt();
        scan.close();

        System.out.println(str.substring(start,end));
        
    }
    
}
/*

Sample Input 0:
Helloworld
3 7

Sample Output 0:
lowo

*/