//Program of Emmployee details..

import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String designation;
    public Employee(int id,String name,String designation)
    {
        this.id=id;
        this.name=name;
        this.designation=designation;
    }
}
public class Test4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        Employee list[] = new Employee[n];
        for(int i=0 ; i<n; i++)
        {
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            String designation=scan.nextLine();
            Employee e= new Employee(id,name,designation);
            list[i]=e;

        }
        int user=scan.nextInt();
        scan.close();
        for(Employee t:list){
            if(t.id==user)
            {
                System.out.println("match found");
                System.out.println(t.id);
                System.out.println(t.name);
                System.out.println(t.designation);
            }
        }


    }
}