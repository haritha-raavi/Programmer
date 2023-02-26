/*
  fine sequence nothing but it is in the form of positive,negative,positive... 
  or negative,positive,negative.....

  there may be more fine sequences but we find the maximum sum of the elements of the fine sequence.
 Sample Input :
 5
 21 10 12 -21 -2
 Sample Output:
 19: Here the fine sequence is 21 -21 and 21 -1 but the maximum sum is for 21 -2 that is 19.
 */




import java.util.*;
public class FineSubSeq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
            a[i] = sc.nextInt();
        sc.close();
        int count,sum=0;

        if(a[0] < 0) count =1;
        else count=0;
        for(int i=0; i<N-1; i++){
            if(count % 2 == 0){
                if(a[i] > 0 ){
                    if(a[i+1] > 0){
                        if(a[i] > a[i+1]){
                            sum+=a[i];
                            count++;
                        }
                        else{
                            sum += a[i+1];
                            count++;
                        }
                    }else{
                        sum+=a[i];
                        count++;
                    }
                }
            }else{
                if(a[i] < 0 ){
                    if(a[i+1] < 0){
                        if(a[i] > a[i+1]){
                            sum+=a[i];
                            count++;
                        }
                        else{
                            sum += a[i+1];
                            count++;
                        }
                    }else{
                        sum+=a[i];
                        count++;
                    }
                }
            }
        }

        if(count % 2 ==0){
            if(a[N-1] > 0)
                sum += a[N-1];
        }
        else
            if(a[N-1] < 0)
                sum += a[N-1];
        System.out.println(sum);
    }    
}