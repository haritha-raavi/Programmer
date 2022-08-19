/*
    We have to decode the string of 1's and 0's in a way that number of repeated 1's should be considered as an alphabet.
    A-1
    B-11
    C-111.....etc
    0 helps to distinguish between the two letters.
    
    Sample input : 1011011101
    Sample output : ABC
 */

import java.util.*;

public class StringDecoder{
    public String decoder(String input1 ){
        int count=0;
        char ch='A';
        String result="";
        for(int i=0; i<input1.length(); i++) {

            if(input1.charAt(i)=='1')
                count++;
            else{
                ch+=count-1;
                result+=ch;
                count=0;
                ch='A';
            }
        
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringDecoder object = new StringDecoder(); 
        System.out.println(object.decoder(str));
        
    }
}