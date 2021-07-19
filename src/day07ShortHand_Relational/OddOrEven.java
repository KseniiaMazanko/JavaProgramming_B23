package day07ShortHand_Relational;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 101;
        boolean isEven = number%2==0;
        boolean isOdd = isEven==false;// or number!=0;

        System.out.println(number + " is even: " + isEven);
        System.out.println(number + " is odd: " + isOdd);

    }

}
