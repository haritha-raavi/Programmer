// program to expand the given string...


import java.util.Scanner;

public class ExpandingString
{
    public static String printResult(char ch,int times)
    {
        String result="";
        for(int i=0;i<times ; i++)
        {
            result+=ch+"";
        }
        return result;
    }
   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();//a1b10c1
        scan.close();
        char alphabets[] = new char[str.length()];
        int numbers[] = new int[str.length()];

        int x=0, y=0, totalDigits=0;
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                alphabets[x]= str.charAt(i);
                x++;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                numbers[y] = str.charAt(i)-'0';
                totalDigits++;
                if(i!=str.length()-1)
                {
                    if(Character.isDigit(str.charAt(i+1)))
                    {
                        numbers[y]=(numbers[y]*10 )+(str.charAt(i+1)-'0');
                        i+=1;
                    }
                   y++; 
               }
            }
        }
        String finalResult="";
        for(int j=0; j<totalDigits; j++)
        {
            finalResult+=ExpandingString.printResult(alphabets[j],numbers[j]);
        }
        System.out.println(finalResult);

    }
}