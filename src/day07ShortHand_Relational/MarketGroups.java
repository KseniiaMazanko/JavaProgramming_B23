package day07ShortHand_Relational;

public class MarketGroups {

    public static void main(String[] args) {


        int score = 52;
        boolean isEarlyBird = score >= 50 && score <= 60;
        boolean group1 = score >= 40 && score <= 49;
        boolean group2 = score >= 30 && score <= 39;
        boolean angryBirds = score  < 30;

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("isEarlyBird = " + isEarlyBird);
        System.out.println("group2 = " + group2);
        System.out.println("group1 = " + group1);

    }
}
