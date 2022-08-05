import java.util.*;
public class Slap2 {
    
    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];// 1 2 2 3 3 3 4 4 5 5 5 5 6 6 6 7 8 9 10
                                // 5 5 5 5 3 3 3 6 6 6 2 2 4 4 1 7 8 9 10
        for(int i=0; i<size; i++){
            a[i]= sc.nextInt();
       }
       for(int i=0; i<size; i++){
        if(hm.containsKey(a[i]))
        hm.put(a[i],(hm.get(a[i])+1));
        else
        hm.put(a[i],1);

    }
      
    }
}
