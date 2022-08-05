import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) 
            a[i]=sc.nextInt();
        System.out.println("Enter key to be searched:");
        int searchKey=sc.nextInt();
        sc.close();
        int count=0;
        for(int x:a)
        {
            if(x==searchKey)
                count++;
        }
        System.out.println(count);
        
    }
}

/**


Sample input 0:
8
4 6 2 87 5 1 3 6
Enter key to be searched:
6

Sample output 0:
2


Sample input 1:
8
4 6 5 3 1 2 7 8 
Enter key to be searched:
9

Sample output 1:
0
 */