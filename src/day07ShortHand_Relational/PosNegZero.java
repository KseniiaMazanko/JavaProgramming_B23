package day07ShortHand_Relational;

public class PosNegZero {

    public static void main(String[] args) {

   int number = -100;

   boolean isPositive = number>0;
   boolean isNegative = number <0;
   boolean isZero = isPositive == false && isNegative == false;

        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is positive: " + isPositive);
        System.out.println(number + " is zero: " + isZero);



    }

}
