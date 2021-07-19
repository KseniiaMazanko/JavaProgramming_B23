package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        System.out.println("How many numbers do you want to enter?");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();;
        int[] numbers = new int[input];
        int sum = 0;
        //double average = 0;


        for(int i = 0; i<=numbers.length-1; i++){
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum+=numbers[i];
        }


        System.out.println("sum = " + sum);

        double average = (double)sum/numbers.length;//casting needed because we have 2 integers
        System.out.println("average = " + average);


    }

}
