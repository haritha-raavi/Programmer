//program to perform bubble sort...

import java.util.Scanner;
public class BubbleSort {
    public static void printArray(int array[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.print(array[i]+"\t");
    }
    public static void sort(int array[],int size)
    {
        for(int i=0; i<size;i++)
        {
            for(int j=0; j<size; j++)
            {
                if(j!=size-1)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
        printArray(array,size);
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


/*Sample Output--
Enter array size:10
Enter array elements:
56 3 87 22 11 33 99 1 001 35
Before sorting:
56      3       87      22      11      33      99      1       1       35
After sorting:
1       1       3       11      22      33      35      56      87      99

*/
