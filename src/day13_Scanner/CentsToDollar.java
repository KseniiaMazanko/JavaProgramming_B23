package day13_Scanner;

import java.util.Scanner;

//import java.util.*;//imports all the classes

public class CentsToDollar {

    public static void main(String[] args) {
            /*
 Write a program that can convert cents to dollars, if there is any
 remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Cents:");
        int cents = input.nextInt();//225
        int dollars = cents/100; //2
        int remainder = cents%100;//25

        if (cents >=0) {
            if (remainder == 0) {
                System.out.println(cents + " is equal to " + dollars + " dollars");
            } else {
                System.out.println(cents + " is equal to " + dollars + " dollars and " + remainder);
            }
        }
        else {
            System.out.println("Invalid amount!");
        }

    }


}
