import java.util.Scanner;


public class Test05
{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        String fName=sc.nextLine();
        String lName=sc.nextLine();
        int pin=sc.nextInt();
        int N=sc.nextInt();
        sc.close();
        int rev=0,l=0,r=0,temp=pin;
        while(temp>0)
        {
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }

        while(N>0)
        {
            l=rev%10;r=pin%10;
            rev=rev/10;pin=pin/10;
            N--;
        }
        if(fName.length() < lName.length())
            System.out.println(fName.charAt((fName.length())-1)+lName+l+""+r);
        else
            if(fName.length() > lName.length())
                 System.out.println(lName.charAt((lName.length())-1)+fName+l+""+r);
            else
            {
                for(int i=0; i<fName.length(); i++)
                {
                    if( fName.charAt(i) == lName.charAt(i))
                        continue;
                    else
                    
                        if( fName.charAt(i)<lName.charAt(i))
                        {
                        System.out.println(fName.charAt((fName.length())-1)+lName+l+""+r);
                        break;
                        }
                        else
                        {
                        System.out.println(lName.charAt((lName.length())-1)+fName+l+""+r);
                        break;
                        }
                }
            }

    }
}