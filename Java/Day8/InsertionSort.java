//program for performing insertion sort...

import java.util.Scanner;
public class InsertionSort {
    public static void printArray(int array[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.print(array[i]+"\t");
    }
    public static void sort(int array[], int size)
    {
        int sortArray[] = new int[size];
        for(int i=0; i<size; i++)
        {
            sortArray[i]=array[i];
            for(int j=0; j<=i; j++)
            {
                if(j!=i)
                {
                    if(sortArray[j]>sortArray[j+1]);
                    {
                        int temp=sortArray[j];
                        sortArray[j]=sortArray[j+1];
                        sortArray[j+1]=temp;
                    }
                }
            }
        }
        printArray(sortArray,size);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++)
            arr[i]=scan.nextInt();
        scan.close();
        System.out.println("Before sorting:");
        printArray(arr,size);
        System.out.println();
        System.out.println("After sorting:");
        sort(arr,size);
    }
}
