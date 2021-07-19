package day09_If_And_Else_Statement;

public class MaxMinNumber {
    public static void main(String[] args) {

        /*
 write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;
            output:
                    30 is the maximum number
         */

        int num1 = 20;
        int num2 = 30;
        int max;
        int min;

        if(num1>num2) {
            max = num1;
            System.out.println(max + " is maximum number");
        }
        else {

            System.out.println(num2 + " is maximum number");
        }

        /*
        write a program that can print out the minimum number between two numbers

        Ex:
            num1 = 20;
            num2 = 30;
            output:
                20 is the minimum number
         */
        if(num1>num2) {
            min = num2;
            System.out.println(min + " is minimum number");
        }
        if(num1<num2) {
            min = num1;
            System.out.println(min + " is minimum number");
        }


    }

}
