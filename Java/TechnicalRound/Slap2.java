/*
 * Sample Input:
 * 19
 * 1 2 2 3 3 3 4 4 5 5 5 5 6 6 6 7 7 8 9 10
 * Sample output:
 * 55553336662244178910
 */

import java.util.*;
public class Slap2 {
    public static LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    public static LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
    public static ArrayList<Integer> ar = new ArrayList<Integer>();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] =new int[size];
        for(int i=0; i<size; i++)
            array[i]=sc.nextInt();
        sc.close();
        for(int i: array){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i, (map.get(i)+1));
        }
        for(int i:map.values())
            ar.add(i);
        Collections.sort(ar,Collections.reverseOrder());
            for(int num:ar){
                for(int key : map.keySet()){
                    if(map.get(key).equals(num))
                        sortedMap.put(key,map.get(key));
                }
            }

        for(int key:sortedMap.keySet())
            for(int i=0; i<sortedMap.get(key); i++)
                System.out.print(key+" ");
    }
}
