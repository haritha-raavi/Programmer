import java.util.Scanner;

public class NestedSwitch {

    static int isPrime(int num) {
        int c=0;
        for(int i=1; i<=num; i++)
        if(num%i ==0)
            c++;
            if(c==2)
                return 1;
            else
                return 0;
        
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        sc.close();
        if(integer==2)
        {
            System.out.println(integer+" is a even prime number");
            System.exit(0);
        }
        if(integer==1)
        {
            System.out.println(integer+" is just a odd number");
            System.exit(0);
        }
        switch(integer%2)
        {
            case 0 : 
                System.out.println(integer+" is a even composite number");
                break;
            case 1:
                switch(isPrime(integer))
                {
                    case 1:
                        System.out.println(integer+" is a odd prime number ");
                        break;
                    case 0:
                        System.out.println(integer+" is a odd composite number");
                        break;
                }
                break;

            }
        }

}
    

