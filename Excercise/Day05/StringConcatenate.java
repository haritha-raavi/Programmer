import java.util.Scanner;
class StringConcatenate
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        for(int i=0;i<s2.length();i++) 
        {
            s1+=s2.charAt(i);
        }
        System.out.println(s1);
    }
}