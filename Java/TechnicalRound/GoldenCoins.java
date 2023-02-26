/*
 *  Here the array represents the coins which each room have, we have to find the entry and exit room number of the seqence of 
    those rooms whose coins sum is equal to given k value.There may be more than one solution, select the smallest entry roon solution.
 */
import java.util.*;
public class GoldenCoins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=0; i<N ;i++){
           for(int j=i; j<N; j++){
                sum+=a[j];
                if(sum == K){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
                else if(sum < K)
                        continue;
                    else
                        break;
           }
        }
    }
}