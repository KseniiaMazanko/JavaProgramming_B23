package day12_Scanner;


import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of rectangle");
        int width = input.nextInt();

        System.out.println("Enter the length of rectangle");
        int length = input.nextInt();

        int area = width*length;
        int perimeter = (width+length)*2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);





    }
}
