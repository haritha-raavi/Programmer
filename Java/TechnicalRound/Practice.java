import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!hm.containsKey(c))
                    hm.put(c,1);
            else
                hm.put(c,hm.get(c)+1);

        }
        System.out.println(sm);
            

    }
    
}

