package day21_WhileAndDoWhile;

import java.util.Scanner;

public class RetrieveTheDIgits {

    public static void main(String[] args) {

        /*
        write a program that can retive the digits, letters and special characters
        from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scan.next();

        String letters = "Letters: ";
        String digits = "Digits: ";
        String specialChar = "Special character: ";


        for(int i=0; i<input.length(); i++){
            if((input.charAt(i)>='A' && input.charAt(i)<='Z' ||
                    input.charAt(i)>='a' && input.charAt(i)<='z')){
            letters += " " + input.charAt(i);
            }
            else if (input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                digits += " "+input.charAt(i);
            }
            else if (input.charAt(i) >= '!' && input.charAt(i) <='?'){
                specialChar += " " + input.charAt(i);
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);

    }

}
