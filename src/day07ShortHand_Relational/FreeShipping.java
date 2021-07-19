package day07ShortHand_Relational;

public class FreeShipping {

    public static void main(String[] args) {

        double price = 15;//>25
        boolean isPrimeMember = true;

        boolean isEligibleForFreeShipping = price>=25 || isPrimeMember;

        System.out.println("isEligibleForFreeShipping = " + isEligibleForFreeShipping);
    }

}
