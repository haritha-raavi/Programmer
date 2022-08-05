//Program to replace 2 or more consecutive spaces with a single space. 

import java.util.Scanner;
public class Test1
{  
     public static int isPrime(int n)
    {
        int fact=0;
        for(int i=1;i<=n; i++)
        {
            if(n%i==0)
               fact++;
            
        }
 
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S=scan.nextLine();
        scan.close();
        char[] ch=S.toCharArray();
        int size=ch.length;
        int sum=0;
        for(int i=0; i<size; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                for(;i<size;)
                {
                    if(Character.isDigit(ch[i]))
                    {
                        if(i==size-1)
                        sum+=ch[i]-48;
                        i++;
                        continue;
                    }
                    else
                    {
                        sum+=ch[i-1]-48;
                        break;
                    }
                }
            }
        }
        if(sum==0)
            System.out.println("-1");
        else
        {
            if(isPrime(sum)<=2)
                System.out.println(sum);
            else
            {
                int rev=0,r,temp=sum;
                while(temp>0)
                {
                    r=temp%10;
                    rev=rev*10+r;
                    temp=temp/10;
                }
                int count=isPrime(rev);
                if(count<=2)
                    System.out.println(rev);
                else
                    System.out.println(count);
                
            }
        }
        
    }
}