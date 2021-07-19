package day16_StringMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MorningPractice {

    /*
    write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.next();

        String result = "";

        if(input.length()==0){
            result = "String is empty";
        }
        else if(input.length()>3){
            result = input.substring(input.length()-3);
            //System.out.println("" + input.charAt(input.length()-3)+input.charAt(input.length()-2) + input.charAt(input.length()-1));
        }
        else{
            result = input;
        }

        System.out.println(result);

    }



}
