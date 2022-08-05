import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        sc.close();
        int sum=0,prod=1;
        for(int i=0;i<n;i++){
            sum+=a[i];
            prod*=a[i];
        }
        if(sum%2==0)
            System.out.println(sum);
        else
            System.out.println(prod);
        
    }   
}

/**
Sample input:

5
1 2 3 4 5

Sample output:
120
 */
