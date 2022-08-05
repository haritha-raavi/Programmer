import java.util.Scanner;

public class Test08 {
    public static int secLarge(int[] a)
    {
        int firstLarge=a[0],secLarge=a[0];
        for(int i:a)
        {
            if(i > firstLarge) 
               firstLarge = i;
        }
        for(int i:a )
        {
            if(i > secLarge )
                if(i < firstLarge) secLarge = i;
        }
        return secLarge;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) 
            a[i]=sc.nextInt();
        sc.close();
        System.out.println(secLarge(a));
    }
}


/**

Sample input:
8
87 43 86 75 89 61 21 88

Sample output:
88
 */