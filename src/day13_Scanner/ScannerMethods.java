package day13_Scanner;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You are a full time employee");
        boolean isFullTime = input.nextBoolean();

        System.out.println("You are older than 21");
        boolean isOlderThan21 = input.nextBoolean();




    }
}
