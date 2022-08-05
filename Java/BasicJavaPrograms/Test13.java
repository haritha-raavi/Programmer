import java.util.*;
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        sc.close();
        int min=arr[0],max=arr[0];
        for(int i=1; i<n; i++)
        {
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("largest number ="+max+"\n"+"Smallest number ="+min);
        Arrays.sort(arr);
        System.out.println("Element  FirstOccurence  LastOccurence");
        int i=0;
        while(i<n)
        {
            for(int j=i; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    continue;
                }
                else
                {  
                    System.out.println(arr[i]+"\t\t"+i+"\t\t"+(j-1));
                    break;
                }

            }
            i++;
        }
        System.out.println(arr[n-1]+"\t\t"+(n-1)+"\t\t"+(n-1));
    }
}
/**

Sample input:
5
1 2 22 4 2

Sample output:
largest number =22
Smallest number =1
Element  FirstOccurence  LastOccurence
1               0               0
2               1               2
2               2               2
4               3               3
22              4               4

*/