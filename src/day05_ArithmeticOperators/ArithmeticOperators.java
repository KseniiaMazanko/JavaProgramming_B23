package day05_ArithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(25/2);
        System.out.println(25/2.0);
        System.out.println(25d/2);

        System.out.println(0/25);


        int a = 100/3;
        System.out.println("a = " + a);

        double b = 100/3;
        System.out.println("b = " + b);
        
        double c = 100.0/3;
        System.out.println("c = " + c);

        int d = 15%6;
        System.out.println("d = " + d);

        int n1= 100;
        int n2 = 40;

        System.out.println(n1%n2);

        int num1 = 10;
        int num2 = 3;
        int result = 10/3;
        int result2 = 10%3;
        System.out.println(num1 + " devided by " + num2 + " is equal to " + result + " with a remainder of " + result2);
    }



}
