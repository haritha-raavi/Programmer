import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int table=sc.nextInt();
        int upto=sc.nextInt();
        sc.close();
        for(int i=1; i<=upto; i++){
            System.out.println(table+" x "+i+" = "+table*i);
        }

    }
}
