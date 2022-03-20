import java.util.Scanner;
class EvenNumbers{

    void even(int number) {
     for(int i=2; i<=number; i++)
        if(i%2==0)
            System.out.print(i+" ");   
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        EvenNumbers obj = new EvenNumbers();
        obj.even(num);
    }
}