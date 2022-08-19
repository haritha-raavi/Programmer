/*
 * There is a milk selling person which have three differnet capacity bottles 1L, 3L, 5L, 10L. We have to find the minimum number 
 * of number bottles required for particular number of liters of milk.
 * 
 * Sample Input:
 * 25
 * Sample output:
 * 3
 */

import java.util.*;

public class MilkBottles {
    public static int count(int n)
    {
        int x=0;
        if(n>=10)
        {
            x+=n/10;
            n=n%10;
        }
        if(n>=5)
        {
            x+=n/5;
            n=n%5;
        }
        if(n>=3)
        {
            x+=n/3;
            n=n%3;
        }
        if(n>=1)
        {
            x++;
            n--;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int liters[] =new int[size];
        for(int i=0; i<size; i++){
            liters[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0; i<size; i++){
            int bottlesCount=0;
            int l=liters[i];
            bottlesCount+=count(l);
            System.out.print(bottlesCount+" ");
        }
     
    }
}
