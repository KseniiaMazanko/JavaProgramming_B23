package day22_LoopsRecap;

import java.util.Scanner;

public class Calculator {

    /*
    write a program that will ask user to enter two numbers and
    calculates the sum, the difference, the division and the multiplication of those two numbers.
    then it asks the user if he/she wants to continue
    if the answer is yes, repeat the whole process again
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        char operator;

        String answer = "";
        //or String answer = "yes"
        //while(answer.equals("yes"))

        while(!answer.equals("no")){//if the answer is not no
            System.out.println("Enter two numbers:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            System.out.println("Enter a math operator:");
            operator = scan.next().charAt(0);

            if(operator == '-'){
                System.out.println("Subtraction: " + (num1-num2));
            }
            else if (operator == '+'){
                System.out.println("Addition: " + (num1+num2));
            }
            else if (operator == '*'){
                System.out.println("Multiplication: " + (num1*num2));
            }
            else if(operator == '/'){
                System.out.println("Division: " + (num1/num2));
            }
            else{
                System.out.println("Invalid Operator");
            }


            System.out.println("Do you want to continue?");//we need this so if the answer is valid it will still ask in the future
            answer=scan.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no"))){ //repeated if statement
                System.out.println("Invalid entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer=scan.next().toLowerCase();
            }


        }

    }


}
