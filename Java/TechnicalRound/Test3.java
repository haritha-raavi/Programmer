import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        sc.close();
        int sum=0,count=1;
        for(int i=1; i<n; i++){
            if(a[i] == a[i-1]+1)
                count+=1;
            else{
                count =1;
            }
            if(count == 4)
            {
               sum+=a[i-3];
                count=0;
            }
        }
        System.out.println(sum);
        
    }
}
