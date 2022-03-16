import java.util.Scanner;
public class Test06
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter user value: ");
        int userValue = sc.nextInt();
        sc.close();
        for(int i=0; i<size; i++){
            for(int j=i; j<size; j++){
                if(arr[i]+arr[j]==userValue)
                     System.out.println(arr[i]+" "+arr[j]);
            }
        }


    }
}

/**


Sample input:
5
2 4 3 3 2
Enter user value: 
5

Sample output:
2 3
2 3
3 2
3 2

*/