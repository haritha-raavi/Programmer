import java.util.Scanner;

public 
class KeyboardInput {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        char charValue=scan.next().charAt(0);
        int intValue=scan.nextInt();
        float floatValue=scan.nextFloat();
        scan.nextLine();
        String stringValue=scan.nextLine();
        double doubleValue=scan.nextDouble();
        scan.close();
        System.out.println("Character Value "+charValue);
        System.out.println("Integer Value "+intValue);
        System.out.println("Float Value "+floatValue);
        System.out.println("String Value "+stringValue);
        System.out.println("Double Value "+doubleValue);






    }
}
