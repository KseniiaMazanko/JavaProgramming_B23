package day15_String;

import java.util.Scanner;

public class FormattingTheName {


    public static void main(String[] args) {


        /*
        ask the user to enter first name
        1. make sure there is no white space
        2. make sure that first char is upper case& the rest of the characters in lower case
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName +" " + lastName;

        System.out.println(fullName);



    }

}
