package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();

        String result = (number%2==0)? "Even" : "Odd";
        String resultPositive = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";

        System.out.println("result = " + result);
        System.out.println("resultPositive = " + resultPositive);






    }

}
