import java.util.Scanner;

public class colorValue {
    public static void main(String arg[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        sc.close();
        switch(value){
            case 1: System.out.println("YEELOW"); break;
            case 2: System.out.println("SKY BLUE"); break;
            case 3: System.out.println("GREEN"); break;
            case 4: System.out.println("RED"); break;
            case 5: System.out.println("ORANGE"); break;
            case 6: System.out.println("WHITE"); break;
            default :
                System.out.println("Choose the coorect option...");
        }
    }
}
