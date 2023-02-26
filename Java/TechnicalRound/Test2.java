import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        sc.close();
        String temp ="";
        for(int i=0;i<k;i++)
            temp+=S;
        int c=0;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0; i<temp.length(); i++){
           if(temp.charAt(i)== '0')
                c+=1;
           else{
            ar.add(c);
            c=0;
           }
        }
        Collections.sort(ar,Collections.reverseOrder());
        System.out.print(ar.get(0));
    }
}
