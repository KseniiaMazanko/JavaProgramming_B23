package day21_WhileAndDoWhile;

public class MultiplyWithoutOperator {

    /*
    write a program that can multiply two numbers without using * operator
     */

    public static void main(String[] args) {

        int a =5, b =3;

        int result = 0;

        for(int i=0; i<b; i++){
            result+=a;
        }
        System.out.println("result = " + result);

        

    }

}
