import java.util.*;
public class PhoneNumberInWords {
    public static HashMap<Character,String> words = new HashMap<Character,String>();

    public String wordFormat(String num){
	
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        scan.close();
        words.put('0',"Zero");
        words.put('1',"One");
        words.put('2',"Two");
        words.put('3',"Three");
        words.put('4',"Four");
        words.put('5',"Five");
        words.put('6',"Six");
        words.put('7',"Seven");
        words.put('8',"Eight");
        words.put('9',"Nine");

        PhoneNumberInWords object = new PhoneNumberInWords();
        System.out.println(object.wordFormat(phoneNumber));

    }
}
