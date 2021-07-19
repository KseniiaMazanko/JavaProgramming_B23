package day22_LoopsRecap;

import java.util.Scanner;

public class sumOfEvenDoWhile {

    //write a program that calculates of the even numbers between 0 and 10

    public static void main(String[] args) {

        int i = 0;
        int sumOfEVen = 0;
        int sumOfOdd = 0;

        do{
            if(i%2==0){
                sumOfEVen+=i;
            }
            else{
                sumOfOdd +=i;
            }

            i++;
        } while(i<=10);//i:0,1,2,3,4,5,6,7,8,9,10

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEVen = " + sumOfEVen);


        System.out.println("_____________________");
        Scanner scan = new Scanner(System.in);
        String userName = "JohnJames";
        String password = "John123";

        String u ="";
        String p ="";
        int attempts =0;

//while with limited time of attempts

        while(!(u.equals(userName) && p.equals(password))){
            System.out.println("Enter your username");
            u = scan.next();

            System.out.println("Enter your password:");
            p = scan.next();
            attempts++;

            if(attempts == 3){
                System.err.println("Your account is locked");
                System.exit(0);
            }

        }

        /* do_while with unlimited times of attempts

        do {
            System.out.println("Enter your username");
            u = scan.next();

            System.out.println("Enter your password:");
            p = scan.next();

        } while( !(u.equals(userName) && p.equals(password)) );

         */

        System.out.println("Logged in");


    }
}
