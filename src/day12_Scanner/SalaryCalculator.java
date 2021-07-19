package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Whats your hourly rate?");
        double horlyRate = input.nextDouble();
        System.out.println("How many hours do you work in a week?");
        int amountOfHours = input.nextInt();
        System.out.println("How many weeks do you work in a year?");
        int amoutOfWeeks = input.nextInt();

        double salary = horlyRate*amountOfHours*amoutOfWeeks;

        System.out.println("Youre making $" + horlyRate + " per hour ");
        System.out.println("You work "+ amountOfHours + " hours in a week");
        System.out.println("Your salary is $" + salary);

    }
    /*
    aske the user
    1. salary
    2. how many hours fo you work in a wee
    3. how many weeks do you work in a year
     */
}
