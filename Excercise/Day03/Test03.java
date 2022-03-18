import java.util.Scanner;

public class Test03 {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i]=scan.nextInt();
        scan.close();
        int min=a[0],max=a[0];
        for(int i:a)
        {
            if(min>i)
                min=i;
            if(max<i)
                max=i;
        }
        System.out.println("Smallest Number = "+min+"\nLargest Number = "+max);
    }
}
