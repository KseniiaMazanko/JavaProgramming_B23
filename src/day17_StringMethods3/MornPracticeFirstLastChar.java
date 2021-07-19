package day17_StringMethods3;

import java.util.Scanner;

public class MornPracticeFirstLastChar {

    public static void main(String[] args) {
        /*
        write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
                IGNORE CASE SENSETIVITY
         */

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        String first = input.substring(0,1);
        String last = input.substring(input.length()-1);

        if(first.equalsIgnoreCase(last)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }


        //SECOND OPTION
//        String first = input.substring(0,1).toLowerCase();
//        String last = input.substring(input.length()-1).toLowerCase();
//
//        if(first.equals(last)){
//            System.out.println("same");
//        }
//        else{
//            System.out.println("not same");
//        }

    }

}
