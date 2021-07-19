package day18_Recap;

import java.util.Scanner;

public class EmailTask {

    public static void main(String[] args) {

        /*
        EmailTask1:
			Assume that email address is constructed by person's first name
			and followed by an underscore and last name.
			Write a program that can swap first name with last name in the email
			(Seperated by an underscore). If the email doesn't contain an underscore
			print the given input email.

			Ex:
				input: mike_tyson@gmail.com
				output: tyson_mike@gmail.com
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.nextLine();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        String result = lastName + "_" + firstName + domain;

        System.out.println("result = " + result);




    }

}
