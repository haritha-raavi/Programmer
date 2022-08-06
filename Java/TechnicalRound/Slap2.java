import java.util.*;
public class Slap2 {
    
    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++){
            a[i]= sc.nextInt();
       }
       for(int i=0; i<size; i++){
            if(hm.containsKey(a[i]))
            hm.put(a[i],(hm.get(a[i])+1));
            else
            hm.put(a[i],1);
       }
      for(Map.Entry<Integer, Integer> obj : hm.entrySet())
      {
      System.out.println( obj.getValue());
      }
      
    }
}
