package day21_WhileAndDoWhile;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        /*
        Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.next();
        int result = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) >='0' && input.charAt(i)<='9'){
                result+=input.charAt(i)-'0';//or -48 because '0' equals to a number 48 in the ascii table
            }
        }

        System.out.println("result = " + result);


    }


}
