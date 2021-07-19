package day07ShortHand_Relational;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John";
        int age = 18;
        String citizen = "USA";
        int creditScore = 630;


        boolean eligibleToVote = age>=18 && citizen=="USA" && creditScore==700;

        System.out.println(name + " is eligible to vote in 2020: " + eligibleToVote);


    }

}
