package day14_Recap;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {



        /*
        Given a number int determine and print out how many digits the number has
        condition: the number has to be betqween 0 to 100000, otherwise "its invalid"

        ex: 124 -> 3 digits
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int number = scan.nextInt();
        scan.close();

//        String result = "";
//
//        if (number > 0 && number <= 100000) {
//            if (number <=9) { //false: n>9
//                result = "1 digit";
//            }
//            else if (number<=99) { //false: number>99
//                result = "2 digits";
//            }
//            else if (number <= 999) {
//                result = "3 digits";
//            }
//            else if (number <= 9999) {
//                result = "4 digits";
//            }
//            else if (number <= 99999) {
//                result = "5 digits";
//            }
//            else {
//                result = "6 digits";
//            }
//        }
//        else {
//            result = "Invalid number";
//        }

        String result2 = (number > 0 && number <= 100000)? (number <=9)? "1 digit" :(number<=99)? "2 digits"
                :(number <= 999)? "3 digits" :(number <= 9999)? "4 digits" :(number <= 99999)? "5 digits" : "6 digits"
                : "Invalid number";

        System.out.println(number + " has " + result2);





    }

}
