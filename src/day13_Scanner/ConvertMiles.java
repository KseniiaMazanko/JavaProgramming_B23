package day13_Scanner;

import java.util.Scanner;

public class ConvertMiles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = input.nextDouble();
        double kilo = miles * 1.609;

        if (miles > 0) {
            System.out.println(miles + "equal to " + kilo + " km");
        }
        else {
            System.out.println("the amount has to be greater than 0!");
        }
        /*
        Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */

    }

}
