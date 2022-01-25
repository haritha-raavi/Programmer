// Program on EXCEPTION HANDLING..
public class Test01
{
    public static void main(String[] args) {
        try{
            int a=100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Can't divide by zero");
        }
    }
}