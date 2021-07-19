package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        System.out.println("Enter the current speed:");
        int speed = new Scanner(System.in).nextInt(); // on;y when we have to get 1 input fron the user for one time use
        //int speed = input.nextInt();
        int speedLimit = 55;
        if (speed > speedLimit){
            System.out.println("You're driving " + (speed - speedLimit) + " mph over the limit. Slow down!");
        }




        /*
        Write a program for the speed check. a variable named speedLimit
         is given and assigned, ask user to enter the current speed,
         if the current speed is over the speedLimit print slow down,
         otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
         */

    }

}
