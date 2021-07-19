package day13_Scanner;

import java.util.Scanner;

public class NextMethodDisadvantage {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();//clears out the scanner's memory (takes the enter)

        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);

    }

}
