package day12_Scanner;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number from 1 to 7:");
        int number = input.nextInt();
        String result = "";

        if (number>=1 && number <= 7){

            if(number == 1){
                result = "Monday";
            }
            else if(number == 2){
                result = "Tuesday";
            }
            else if(number == 3){
                result = "Wednesday";
            }
            else if(number == 4){
                result = "Thursday";
            }
            else if(number == 5){
                result = "Friday";
            }
            else if(number == 6){
                result = "Saturday";
            }
            else {
                result = "Sunday";
            }

        }
        else {
            result = "Invalid entry";
        }

        System.out.println(result);


    }



}
