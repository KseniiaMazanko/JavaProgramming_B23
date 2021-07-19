package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        String shippingAddress = fullName + "\n" + buildingNumber + " " + streetAddress + "\n" + cityName +
                state +"\n" + zipCode;

        System.out.println("shippingAddress = " + shippingAddress);

//        System.out.println(fullName);
//        System.out.println(buildingNumber + " " + streetAddress);
//        System.out.println(cityName + " " + state);
//        System.out.println(zipCode);
        /*
        ask for
        1. building number (nextInt)
        2. street name (nextLine)
        3. city name (nextLine)
        4. state (next)
        5. zip code (next)
        6. full name

        print the shipping info of the person

        ex:
        full name
        full address
        city name, state
        zip code
         */

    }

}
