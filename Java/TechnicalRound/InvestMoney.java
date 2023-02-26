import java.util.*;

public class InvestMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++) 
            a[i] = scan.nextInt();
        scan.close();
        Arrays.sort(a);
        for(int i=0; i<N/2; i++){
            if(a[i] != a[N-i-1]){
                a[i] += K;
                a[N-i-1] -= K;
            }
        }
       System.out.println(a[N-1]-a[0]);
       for(int i=0; i<N; i++){
        System.out.print(a[i]);
       }
    }
}
