package day32_MethodOverloading;

public class WarmUpTast1 {

    /*1. create a method that can find the sum of two numbers
    method name: sumOf2Numbers

    2. create a method that can find the sum of three numbers
    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
    method name: sumOf4Numbers

     */

    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a+b+c+d;
    }

    //-------------------------method overloading------------------------

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum (double a, double b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //                      1,      2,      3,      4
    public static int sum (int a, int b, int c, int d){
        //3 options to get the sum of the numbers
        //return sum(a,b) + sum(c,d);
        return sum(sum(a,b), sum(c,d));
        //  sum(      3             7 )
        //   10
        //return sum(a,b,c) + d;

    }





    public static void main(String[] args) {



        int sum = sumOf2Numbers(10,12);
        System.out.println(sum);

        int sum2 = sumOf3Numbers(100,200,300);
        System.out.println(sum2);

        int sum3 = sumOf4Numbers(100, 200, 300, 400);
        System.out.println(sum3);

        System.out.println("______________Overloading_________________");

        //method overloading methods

        int r1 = sum(10,12);

        double r4 = sum(10.5, 6.9);

        int r2 = sum(100,200,300);

        int r3 = sum(100,200,300,400);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);




    }






}
