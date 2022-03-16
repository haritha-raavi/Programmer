import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) 
            arr[i]=sc.nextInt();
        sc.close();
        String s="";
        for(int i=0; i<n; i++)
        {
            if(arr[i]%3==0 && arr[i]%5==0)
                s+="FizzBuzz"+" ";
            else
                if(arr[i]%3==0)
                    s+="Fizz"+" ";
                else
                    if(arr[i]%5==0)
                        s+="Buzz"+" ";
                    else
                        s+=arr[i]+" ";


        }
        System.out.println(s);
    }
}
 

/**

Sample input:
5
1 2 3 4 5

Sample output:
1 2 Fizz 4 Buzz


 */