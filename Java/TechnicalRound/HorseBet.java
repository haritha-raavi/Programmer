/*
 * Bob is going to bet on horse riding.The array elemnet represents horse bet prices, so we have to select the maximum Continues sequence 
  length which adds up is leass than K. There may be multiple solutions,bob select randomly.
    Sample Input 1: 
        10 100 (N=10, K=100-reward money)
        30 40 50 20 20 10 90 10 10 10 
    Sample Output 1:
        3 - the maximum continous length is 3.
  
 */
import java.util.*;
public class HorseBet{
    public static ArrayList<Integer> ar = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();
        sc.close();
        
        int sum,count;
        for(int i=0; i<N; i++){
            sum=0;
            count=0;
            for(int j=i; j<N; j++){
                sum+=a[j]; // 
                count ++; //3
                if(sum >= K){
                    ar.add(count-1);
                    break;
                }            
            }
        }
        Collections.sort(ar);
        System.out.println(ar.get(ar.size()-1));
    }
}