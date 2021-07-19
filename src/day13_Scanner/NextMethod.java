package day13_Scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();//only takes the first word
        System.out.println("Enter yout last name:");
        String lastName = scan.next();

        //System.out.println(firstName);
        //System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address:");
        String address = scan.next();
        System.out.println("address = " + address);


        
        
    }
}
