import java.util.*;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int R = sc.nextInt();
        sc.close();

        if((!s.matches("[a-z]*")) || R < 2 || R > 50)
            return;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '\0')
                continue;
            int count =1;
                for(int j=i+1; j<s.length(); j++){
                    if(c == s.charAt(j)){
                        count++;
                        s.replace(s.charAt(j),'\0');
                    }
                    else
                        break;
                }
                if(count !=R)
                    System.out.print(c);
        }
       
    }
}
