package day28_CustomMethods;

import java.util.Scanner;

public class MethodsPractice {

    public static void main(String[] args) {

        printOddNumbers(10,20);

        System.out.println("Enter two numbers:");//get the input from user
        Scanner scan = new Scanner(System.in);
        printEvenNumbers(scan.nextInt(), scan.nextInt());

        calculateTheAge(1994);

        eligibleToVote(30, true);

        calculateTwoNumbers(5,7,'+');

    }
    /*
       create a method that can print odd numbers between 1~100 in
       a same line seperated by space
        */

    public static void printOddNumbers (int from, int to) {//when we dont know the range
         for(int i=from; i<=to; i++){
             if(i%2!=0){
                 System.out.print(i + " ");
             }

         }
        System.out.println();
    }
/*
create a method that can print even numbers between any 2 given numbers
 */

    public static void printEvenNumbers(int from, int to){
        for(int i=from; i<=to; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
/*
create a method that can calculate the age of the person
 */

    public static void calculateTheAge (int birthYear){
        int age = 2021 - birthYear;
        System.out.println("The person is " + age + " years old");
    }

    /*
    check eligibility to vote
     */

    public static void eligibleToVote (int age, boolean isUSCitizen) {
        if(age>=21 && isUSCitizen){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void calculateTwoNumbers (int num1, int num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Addition: " + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case '/':
                System.out.println("Division: " + (num1/num2));
                break;
            case '%':
                System.out.println("Remainder " + (num1%num2));
                break;
            default:
                System.out.println("Invalid entry");
        }
    }



}
