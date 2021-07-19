package day20_BranchingStatements;

import java.util.Scanner;

public class InfiniteLoop {

    /*Write a program that calculates the sum of numbers entered by the
    user until user enters a negative number.
            hint: you need an infinite loop

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input =0;
        int sum = 0;


        for (int i = 1; i>0;) {
            System.out.println("Enter the number:");
            input = scan.nextInt();

            if(input<0){
                break;
            }
            else{
                sum+=input;
            }
        }
        System.out.println("The sum of all positive numbers is " + sum);

    }



}
