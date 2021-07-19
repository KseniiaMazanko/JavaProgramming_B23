package day10_If_Statements;

public class TernaryTasks {

    public static void main(String[] args) {

        /*
       Ternary Tasks:
    EligibleToVote
    EligibleToBuyAlcohol
    PassOrFailed
         */
       // EligibleToBuyAlcohol
        int age = 18;

        String isEligible = (age>=21)? "Eligible" : "Not eligible";
        System.out.println(isEligible);

        //EligibleToVote
        int ageToVote = 23;
        String citizenship = "USA";

        String result = (ageToVote>=21 && citizenship=="USA")? "Eligible to vote" : "Not eligible";
        System.out.println(result);

        //PassOrFail

        int score = 80;

        String result2 = (score>=60)? "Passed" : "Failed";

        System.out.println(result2);







    }

}
