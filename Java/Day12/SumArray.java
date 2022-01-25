//Program to find the negative sum arrays of subarray of given array..

import java.util.Scanner;
public class SumArray
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size; i++)
            arr[i]=scan.nextInt();
        scan.close();
        int count=0;
        int num=1;
        for(int i=0;i<size;i++)
        {
            if(num<=size)
            {
                int sum=0;
                for (int j=0;j<size;j++)
                {
                    sum+=arr[j];
                }
                if(sum<0)
                count++;
            num++;

        }
        System.out.println(count);
        
    }
}