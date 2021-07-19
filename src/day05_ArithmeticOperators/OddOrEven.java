package day05_ArithmeticOperators;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number%2 ==0 ;// if the remainder of number/2 is equal to 0, then the number is even
        boolean isOdd = number%2 >0 ;// if the remainder of number divided by 2 is greater then 0 then its odd

        System.out.println(number + " is an even number: "+ isEven);
        System.out.println(number + " is an odd number: "+ isOdd);
    }
}
