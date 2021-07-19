package day08_ifStatements;

public class Grade_report {

    public static void main(String[] args) {

        String name = "James";
        int score = 70;
        if(score>=90 && score<100) {

            System.out.println(name + "'s score is A");
        }

        if(score>=80 && score < 90) {

            System.out.println(name + "'s score is B");
        }

        if (score>=70 && score< 80) {

            System.out.println(name + "'s score is C");
        }

        if (score>=60 && score<70){
            System.out.println(name + "'s score is D");
        }
        if (score <60){
            System.out.println(name + "'s score is F");
        }
        /*
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 50-59
         */

    }

}
