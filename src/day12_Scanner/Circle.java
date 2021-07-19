package day12_Scanner;

import java.util.Scanner;

public class Circle {


    /*
    find the area and perimeter of circle
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double pi = 3.1416;
        double area = 0;

        if (radius > 0) {
            area = pi * radius * radius;
            System.out.println("Based on the entered data the area of the circle is " + area);
        }
        else {
            System.out.println("Invalid entry, the radius can not be negative!");
        }






    }




}
