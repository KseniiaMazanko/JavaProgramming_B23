package day17_StringMethods3;

import java.util.Scanner;

public class MornPracticeAccount {

    public static void main(String[] args) {
        /*
        1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do
    not meet the expected results print “Invalid account number”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number");
        String accountNumber = scan.next();

        if(accountNumber.length() == 7 || accountNumber.length()==10){
            if(accountNumber.charAt(0) == '2' && accountNumber.length() == 7){
                System.out.println("Valid account");
            }
            else if(accountNumber.charAt(0) == '5' && accountNumber.length() == 10){
                System.out.println("Valid Account");
            }
            else{
                System.out.println("Invalid");
            }

        }
        else{
            System.out.println("Invalid account");
        }


        /*
        char firstChar = accountNumber.charAt(0);
        switch(firstChar) {
            case '2': //if the first character of account is 2
                if(accountNumber.length() == 7){ //if the length of the account is 7
                    System.out.println("Valid Account");
                }
                else{ //if length of account is not 7
                    System.out.println("Invalid: should be 7 characters long");
                }
                break;


            case '5':
                if(accountNumber.length() == 10){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid: has to be 10 chars long");
                }
                break;

            default:
                System.out.println("Invalid");

        }
        */



    }
}
