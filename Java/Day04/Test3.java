//Program for anagrams..

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1=scan.nextLine().toUpperCase();
        String str2=scan.nextLine().toUpperCase();
        scan.close();
        boolean result=false;
        for(int i=0; i<str1.length(); i++)
        {
            char ch1=str1.charAt(i);
            int count1=0,count2=0;
            for(int j=0; j<str1.length();j++)
            {
                if(ch1==str1.charAt(j))
                    count1++;
 
            }
            for(int k=0; k<str2.length(); k++)
            {
               char ch2=str2.charAt(k);
               if(ch1==ch2)
               {
                   for(int l=0;l<str2.length();l++)
                   {
                    if(ch2==str2.charAt(l))
                          count2++;
            
                   }
                   break;

               }
            }
            if(count1!=count2)
            {
                result=false;
                break;
            }
            else
               result=true;

        }
        if(result)
              System.out.println("ANAGRAMS");
        else
                System.out.println("NOT ANAGRAMS");

     
    }
}
