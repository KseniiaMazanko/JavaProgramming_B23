package day12_Scanner;

import java.sql.SQLOutput;

public class SwitchWarmupFizzBuzz {

    public static void main(String[] args) {

        /*
        write a program that can print any number between 1 ~ 10, but for number
        which is a multiple of 3 print "Fizz" instead of the number and for number
        which is a multiple of 5, print "Buzz" instead of the number, and for number
        which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
         */

        int number = 9;

        switch (number) {

            case 3:
            case 6:
            case 9:
                System.out.println("Fizz");
                break;


            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;


            case 5:
            case 10:
                System.out.println("Buzz");
                break;
        }



    }
}
