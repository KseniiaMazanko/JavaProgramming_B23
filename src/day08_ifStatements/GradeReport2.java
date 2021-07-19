package day08_ifStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 65;

        boolean madeA = score>=90 && score<=100;
        boolean madeB = !madeA && score >= 80; // did not make A and score id greater than 80
        boolean madeC = !madeB && score >= 70; //madeB already includes !madeA
        boolean madeD = !madeC && score >= 60;
        boolean madeF = score < 60;

        if (madeA) {

            System.out.println("Excellent, You made an A");

        }

        if(madeB) {
            System.out.println("Good, You made a B");
        }

        if(madeC) {
            System.out.println("Good, You made a C");
        }

        if(madeD) {
            System.out.println("You made D");
        }

        if(madeF) {
            System.out.println("You got F, sorry");
        }


    }

}
