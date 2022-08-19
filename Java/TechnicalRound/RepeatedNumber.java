/*
  Find the first repeated number from the last index of the array.
  Conditions: 1- Only non-negative and non-zero numbers should be considered.
            : 2- If there are no such numbers then return 0 as the output.
            : 3- If no number is repeated then return the last element of the array.
  Sample Input: 
  5
  1 -2 1 -2 5
  Sample Output:
  1
 */
import java.util.*;

public class RepeatedNumber{
    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public int findNumber(int a[], int size){
    for(int i=size-1 ; i >=0 ; i--){
        if(a[i]>0)
        {
            if(hm.containsKey(a[i]))
                return a[i];
            hm.put(a[i],1);
        }
    }
    System.out.println(hm);
    if(hm.isEmpty()) return 0;
    return a[size-1];
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++)
            a[i]=sc.nextInt();
        sc.close();
        RepeatedNumber num  = new RepeatedNumber();
        System.out.println(num.findNumber(a,size));

    }
}