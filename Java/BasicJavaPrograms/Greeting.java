import java.util.Scanner;

public class Greeting {
    String sName;
    int sMarks;
    Greeting(String name,int marks)
    {
        sName = name;
        sMarks=marks;
    }
    void message(String s,int m)
    {
        if(m>90)
          System.out.println("Congratulations "+s+" you got 'A' grade..!!");
        else
           if(m>75)
              System.out.println("Congratulations "+s+" you got 'B' grade..!!");
           else
              if(m>60)
                System.out.println("Congratulations "+s+" you got 'C' grade..!!");
              else
                if(m>50)
                   System.out.println("Congratulations "+s+" you got 'D' grade..!!");
                else
                  if(m>35)
                    System.out.println("Congratulations "+s+" you got 'E' grade..!!");
                  else
                    System.out.println("Sorry "+s+" You got failed\n'Better Luck Next Time'");

    }
    public static void main(String num[])
    {
        Scanner sc=new Scanner(System.in);
        Greeting object = new Greeting(sc.nextLine(),sc.nextInt());
        sc.close();

        object.message(object.sName,object.sMarks);

    }
}
