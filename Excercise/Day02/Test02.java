import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int size =sc.nextInt();
         int array[][] = new int[size][size];
         for(int i=0; i<size; i++)
         {
             for(int j=0; j<size; j++)
                 array[i][j]=sc.nextInt()+(i+1)+(j+1);
         }
         for(int i=0; i<size; i++)
         {
             for (int j=0; j<size; j++)
                System.out.print(array[i][j]+"\t");
            System.out.println();
         }
        sc.close();
    }
    
}

/** 
 Sample input :
 3
 1 2 3 
 4 5 6
 7 8 9

 Sample output:
3       5       7
7       9       11
11      13      15
*/
