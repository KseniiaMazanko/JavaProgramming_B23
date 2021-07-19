package day08_ifStatements;

public class SingleIfStatements {

    public static void main(String[] args) {

        int score = 90;
        boolean passed = score>=60;
        if(passed) { //if the condition is met line 11 get executed otherwise it just skips it

            System.out.println("Congrats you passed the exam");

        }

        if (!passed){
            System.out.println("Unfortunately, you have not passed the test");
        }

    }

}
