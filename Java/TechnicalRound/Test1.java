import java.util.*;
public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n> 100001 || n< 0)
            return;
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int k= sc.nextInt();
        sc.close();
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        for(int i : a){
            if(tm.containsKey(i))
                tm.put(i, tm.get(i)+1);
            else
                tm.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
            if(entry.getValue() == k){
                System.out.print(entry.getKey());
                break;
            }
        }
    }
}