import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        sc.close();
        int count = 0;
        for(int i=n-1; i>=0; i--){
            if(a[i] == 2)
                count++;
            else{
                System.out.print(count);
                return;
            }
        }
        System.out.print(count);
    }
}