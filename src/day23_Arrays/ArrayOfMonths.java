package day23_Arrays;

import java.util.Scanner;

public class ArrayOfMonths {

    public static void main(String[] args) {

        String [] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();


        if(n>=1 && n<=12) {
            System.out.println(months[n - 1]);
        }
        else{
            System.out.println("Invalid number");
        }



    }
}
