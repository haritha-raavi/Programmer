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
       int A[]=new int[n1];
       int B[]=new int[n2];
       for(int i=0;i<n1; i++)
            A[i]=array[l+i];
       for(int i=0;i<n2; i++)
            B[i]=array[mid+1+i]; 
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(A[i]<=B[j])
            {
                array[k]=A[i];
                i++;
            }
            else{
                array[k]=B[j];
                j++;

            }
            k++;
        }
        while(i<n1)
        {
            array[k]=A[i];
            i++;
            k++;

        }
        while(j<n2)
        {
            array[k]=B[j];
            j++;
            k++;

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

Sample input 0:
10
4 2 77 5 1 8 3 21 9 10

Sample Output 0:
1       2       3       4       5       8       9       10      21      77