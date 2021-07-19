package day23_Arrays;

import day12_Scanner.ScannerIntro;

import java.util.Scanner;

public class NameOfTheDay {

    public static void main(String[] args) {

        String [] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Satudray", "Sunday"};

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);



    }

}
