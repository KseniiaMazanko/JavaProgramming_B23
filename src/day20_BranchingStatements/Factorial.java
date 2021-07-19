package day20_BranchingStatements;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        /*
        Write a program that can return the factorial number of any
        given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scan.nextInt();
        //int input = new Scanner(System.in).nextInt();


        int result = 1;

        for (int i=1; i<=input; i++){
            result *=i;
        }


        /* option 2
        for(int i = input; i>=1; i--){
            result*=1;
        }
        */



        System.out.println(result);



    }
}
