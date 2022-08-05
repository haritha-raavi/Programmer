/*
 * You are allowed to remove exactly one integer from the given array. Print the minimum possible median of the final array
 *  obtained by deleting exactly one element from array A.
 * Sample input: 
 * 4
 * 2 4 4 3
 * 
 * Sample output: 
 * 3
 */


import java.util.*;
public class Median
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        sc.close();
        Arrays.sort(a);
        System.out.println(a[(n-1)/2]);
    }
}