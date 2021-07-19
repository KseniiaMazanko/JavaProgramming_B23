package day12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        String result = "";

        if(age>=21){
           result = "Youre eligible to buy alcohol";
        }
        else{
            result = "Get out";
        }

        System.out.println(result);


    }




}
