import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int length1=sc.nextInt();
    int length2=sc.nextInt();
    int array1[] = new int[length1];
    int array2[] = new int[length2];
    for(int i=0; i<length1; i++) 
        array1[i]=sc.nextInt();    
    
    for(int i=0; i<length2; i++)
        array2[i]=sc.nextInt();
    sc.close();
    if(length1<length2)
    {
        for(int x:array1)
            for(int y:array2)
                 if(x==y)
                    System.out.print(x+"  ");
    }
    else
    {
        for(int x:array2)
           for(int y:array1)
             if(x==y)
                System.out.print(x+"  ");

    }
}

}

/**

Sample input:
5
8
1 2 3 4 5
1 2 3 4 5 6 7 8

Sample Output:
1  2  3  4  5  


*/

