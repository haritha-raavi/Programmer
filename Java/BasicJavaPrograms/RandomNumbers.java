import java.util.*;

public class RandomNumbers {
    public static void main(String arg[])
    {

        Random obj = new Random();
        int n=5;
        while(n>0){
            int temp=obj.nextInt();
            if(temp>1 && temp<100)
            {
                System.out.printf("%d  ",temp);
                n--;
            }
        }
    }
}
