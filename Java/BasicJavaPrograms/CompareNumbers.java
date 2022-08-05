import java.util.Scanner;

public class CompareNumbers {

    int num1,num2;
    CompareNumbers(int num1,int num2) {
      this.num1=num1;
      this.num2=num2;
    }

    void compare(int a, int b)
    {
        if(a==b)
            System.out.println(a+" is equal to "+b);
            else
                if(a<b)
                    System.out.println(a+" is smaller than "+b);
                else
                    System.out.println(a+" is greater than "+b);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        CompareNumbers obj = new CompareNumbers(sc.nextInt(),sc.nextInt());
        sc.close();
        obj.compare(obj.num1,obj.num2);

    }
}
