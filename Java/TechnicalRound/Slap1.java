/*
    We have to print the words lexicographically that are repeated in the given input string.
    Sample Input: 
    cat batman latt matter cat matter cat
    Sample ouput:
    cat matter
 */
import java.util.*;
public class Slap1 {
    public static TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String str[] = input.split(" ");
        
        for(int i=0; i<str.length; i++){
            if(tm.containsKey(str[i]))
            tm.put(str[i],(tm.get(str[i])+1));
            else
            tm.put(str[i],1);

        }
        for(Map.Entry<String,Integer> entry : tm.entrySet())
        {
            if(entry.getValue()>1)
            System.out.print(entry.getKey()+" ");
        }
    
    }
}
