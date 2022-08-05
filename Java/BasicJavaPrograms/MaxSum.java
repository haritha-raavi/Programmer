import java.util.Scanner;
interface MyInterface 
{
    abstract public int evenSum(int arr[],int n);
    abstract public int oddSum(int arr[],int n);
}
class Sum implements MyInterface
{
    public  int evenSum(int arr[],int n)
    {
        int sum=0;
        for(int i=1; i<arr.length; i+=2)
            sum+=arr[i];
        return sum;
    }
    public int oddSum(int arr[],int n)
    {
        int sum=0;
        for(int i=0; i<arr.length; i+=2)
            sum+=arr[i];
        return sum;
    }
}
public class MaxSum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int elements[] = new int[size];
        for(int i=0; i<size; i++)
            elements[i]=sc.nextInt();
        sc.close();
        Sum obj = new Sum();
        int oddSum = obj.oddSum(elements,size);
        int evenSum = obj.evenSum(elements,size);
        if(oddSum>evenSum) 
            System.out.println(oddSum);
        else
            System.out.println(evenSum);
    }
}

