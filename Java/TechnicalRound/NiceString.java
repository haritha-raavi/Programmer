/*
 A nice String is a binary string which contains atleast one 1.Find the number of NICE SUBSTRINGS-the substring is in continous string.
 Sample Input :
 10010
 Sample Output:
 6
*/


import java.util.*;
public class NiceString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        sc.close();
        int count=0;
        for(int i = 0; i < binary.length(); i++) {
            for(int j=i+1; j<=binary.length(); j++)
            {
                String s = binary.substring(i,j);
                for(int k=0; k<s.length(); k++)
                {
                    if(s.charAt(k)=='1') 
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
