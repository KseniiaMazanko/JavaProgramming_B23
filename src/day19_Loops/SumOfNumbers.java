package day19_Loops;

public class SumOfNumbers {

    public static void main(String[] args) {

        /*write a program that can calculate the sum of all numbers between 1 to 100

         */
        int sum = 0;
        for(int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);


    }


}
