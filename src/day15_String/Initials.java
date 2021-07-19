package day15_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*
        ask user to enter first name and
        last name
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        //String firstName = scan.next();
        char f = scan.next().charAt(0);


        System.out.println("Enter your last name:");
       // String lastName = scan.next();
        char l = scan.next().charAt(0);
        scan.close();

        //char f = firstName.charAt(0);
        //char l = lastName.charAt(0);

        //String initial = f + "." + l;
        String initial = f + "." +l;

        System.out.println("initial = " + initial);


    }

}
