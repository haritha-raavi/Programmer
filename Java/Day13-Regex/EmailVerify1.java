// Program to verify email with reggular Expression(REGEX)..


public class EmailVerify1 {
    public static void main(String[] args) {
        String mail="haritha_raavi@coder.org";
        String regex="[A-Za-z]+_[A-Za-z]+@[A-Za-z]+\\.org";
        if(mail.matches(regex))
            System.out.println("Valid MAIL");
        else
            System.out.println("Invalid MAIL");
    }
    
}


// Sample Output
// Valid MAIL