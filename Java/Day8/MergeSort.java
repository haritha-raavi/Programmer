// Merge sort

import java.util.Scanner;
public class MergeSort
{
    public static void partition(int array[],int l,int h)
    {
        if(l<h)
        {
            int mid=(l+h)/2;
            partition(array,l,mid);
            partition(array,mid+1,h);
            merge(array,l,mid,h);
        }
    } 
    public static void merge(int array[],int l,int mid,int h)
    {
        int n1=mid-l+1;
        int n2=h-mid;
        int lArray[]= new int[n1];
        int rArray[] = new int[n2];
        for(int i=0; i<n1; i++)
            lArray[i]=array[l+i];
        for(int j=0; j<n2; j++)
            rArray[j]=array[mid+1+j];
        int i=0 , j=0 ,k=l;
        while(i<n1 && j<n2)
        {
            i
        }




    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int array[] = new int[size];
        for (int i=0; i<size; i++)
            array[i]=scan.nextInt();
        scan.close();
        partition(array,0,size-1);
        for( int i=0;i<size; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}