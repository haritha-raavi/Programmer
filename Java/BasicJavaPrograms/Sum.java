public class Sum {
    public static void main(String ar[])
    {
        int result=0;
        for(int i=101; i<200; i++)
        {
            if(i % 7 == 0)
                result+=i;
        }
        System.out.println("Sum of 7 multiples between 100 and 200 is "+result);
    }
}
