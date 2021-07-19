package day17_StringMethods3;

import java.util.Scanner;

public class WebAddress {


    public static void main(String[] args) {


         /*
    verify the web address:
        starts with www.
        ends with: .com, .edu, .gov
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the web address:");
        String input = scan.next();

        /*
        boolean isValidUrl = url.startsWith("www.") &&
                        (  url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov")  );

        System.out.println("isValidUrl = " + isValidUrl);
         */
        if (input.startsWith("www.") && (input.endsWith(".com") || input.endsWith(".gov") || input.endsWith(".edu"))){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }


    }
}
