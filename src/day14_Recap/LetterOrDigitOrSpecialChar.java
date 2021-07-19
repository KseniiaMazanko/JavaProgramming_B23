package day14_Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LetterOrDigitOrSpecialChar {


    public static void main(String[] args) {

        char ch = 'W';

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        // if the character is upper case letter or lower case letter

        /*
        String result = "";
        if(isDigit)

        {
            result = "Digit";
        }
        else if(isLetter)

        {
            result = "Letter";
        }
        else

        {
            result = "Special Character";
        }

        System.out.println("result = " + result);
        */

        String result = (isDigit)? ch + " is digit" :(isLetter)? ch + " is letter" : ch + " is special character";


        System.out.println("result = " + result);

    }



}


