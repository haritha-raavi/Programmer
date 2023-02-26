/*
  Given a string S made of characters a,b and c you need to find the number of substrings
that do not contains all the letters a,b and c. That is the number of sub strings that do not
contain atleast one character a or b or c. 

Note the substring is not empty.
Sample Input:            Sample Output:
     abc                      5
     babacac                  19
     ababa                    15
 */

import java.util.*;
public class SubStringFormat{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   sc.close();
        int count=0;
   for(int i=0; i<str.length(); i++){
        for(int j=i; j<str.length(); j++){
            String temp = str.substring(i,j+1);
            if(!(temp.contains("a") && temp.contains("b") && temp.contains("c")))
                count++;
        }
   }
  
System.out.print(count);
}
}