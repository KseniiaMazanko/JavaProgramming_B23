package day21_WhileAndDoWhile;

import java.util.Scanner;

public class SumOfNumbersUntilNegative {

    public static void main(String[] args) {

        /*
        calculate the sum of entered numbers until the user enters the negative number
         */

        Scanner scan = new Scanner(System.in);
        int sum = 0;


        while(true) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if(n<0){
                break;
            }

            sum += n;
        }

        /*
        or 2nd option:
        
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n=0;

        while(n>=0) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();

            sum += n;
        }
         */


        System.out.println("The sum of positive numbers equals to: " + sum);




    }

}
