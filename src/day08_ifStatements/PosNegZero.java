package day08_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number =100;
        boolean positive = number>0;
        boolean negative = number<0;
        boolean zero = number == 0; //!positive && !negative

        if (positive) {

            System.out.println("Number is positive");

        }

        if (negative) {

            System.out.println("Number is negative");
        }

        if (zero) {

            System.out.println("Number is equal to zero");

        }

    }

}
