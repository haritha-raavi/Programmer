import java.util.Scanner;

class Factorial
{
    int value;
    int recursiveFact(int n)
    {
        if(n>0)
            return n*recursiveFact(n-1);
        else
            return 1;
    }
    Factorial(int num)
    {
        value=num;
    }
    int iterationFact(int num)
    {
        int result=1;
        while(num>0)
        {
            result*=num;
            num--;
        }
        return result;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Factorial object = new Factorial(sc.nextInt());
        sc.close();
        System.out.println("Recursion Fact"+object.recursiveFact(object.value));
        System.out.println("Iteration fact"+object.iterationFact(object.value));
    }
}