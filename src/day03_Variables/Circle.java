package day03_Variables;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;
        double pi = 3.14;
        double area = radius * radius * pi;
        double perimeter = 2 * radius * pi;

        System.out.print("Area: ");
        System.out.println(area);
        System.out.print("Perimeter: ");
        System.out.println(perimeter);
    }
}
