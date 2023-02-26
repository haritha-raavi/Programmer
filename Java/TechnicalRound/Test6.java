import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if(s.length() < 1 || s.length() > 500)
            return;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        int sum=0;
        for(Integer x : hm.values()){
    
            if(x!= 1){
                int val=1;
                for(int i=1; i <= x; i++){
                    val*=i;
                }
                sum+=val;
            }
        }
        int result=1;
        for(int i=1; i<=s.length(); i++){
            result*=i;
        }
        if(sum !=0) 
             System.out.println(result/sum);
        else
         System.out.println(result);
    }
}
