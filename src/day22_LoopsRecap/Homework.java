package day22_LoopsRecap;

import java.util.Scanner;

public class Homework {

    /*
    Ask the user to enter 2 numbers and a math operator and return the result
    If the operator is invalid ask the user to re-renter the operator until user
    provides a valid operator
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter 2 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        if(operator == '+'){
            System.out.println("Addition: " + (num1+num2));
        }
        else if(operator == '-'){
            System.out.println("Subtraction: " + (num1-num2));
        }
        else if(operator == '*'){
            System.out.println("Multiplication: " + (num1*num2));
        }
        else if(operator == '/'){
            System.out.println("DIvision: " + (num1/num2));
        }




    }


}
