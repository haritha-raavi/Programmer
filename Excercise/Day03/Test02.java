import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            int count=0;
            for(int j=i+1; j<str.length(); j++)
                if(ch==str.charAt(j))count++;
            if(count==0)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
    
}
