import java.util.Scanner;

public class StudentGrade {
    public static void main(String arg[]){
        char grade;
        Scanner sc  = new Scanner(System.in);
        int marks=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        sc.close();
        if(marks>90)
            grade='A';
            else
                if(marks>75)
                    grade='B';
                else
                    if(marks>50)
                        grade='C';  
                    else
                        if(marks>40)        
                            grade='D';
                        else
                            grade='F';
        switch(grade)
        {
            case 'A':
                System.out.println("Out Standing "+name+" Your grade is 'A'");
                break;
            case 'B':
                System.out.println("Very Good "+name+" Your grade is 'B'");
                break;
            case 'C':
                System.out.println("Good "+name+" Your grade is 'C'");
                break;
            case 'D':
                 System.out.println("Better "+name+" Your grade is 'D'");
                 break;
            case 'F':
                 System.out.println("Sorry "+name+" You failed ");
                 break;
        }

    }
}
