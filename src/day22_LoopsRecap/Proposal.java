package day22_LoopsRecap;

import java.util.Scanner;

public class Proposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        while( !(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid entry, re-enter");
            System.out.println("Will you marry me?");
            answer = scan.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Congrats");
        }
        if(answer.equals("no")){
            System.out.println("Ok dude good bye");
        }

    }
}
