package day07ShortHand_Relational;

public class EligibleForLoan {

    public static void main(String[] args) {


        String name = "Bob Burger";
        int income = 100_000;
        int workHistory = 7;
        int creditScore = 786;
        int age = 42;

        boolean isEligibleForLoan = income >=60_000  &&   workHistory >=2  &&  creditScore >=700
                && age >=18;

        System.out.println(name + " is eligible for a loan: " + isEligibleForLoan);

    }

}
