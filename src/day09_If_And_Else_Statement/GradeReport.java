package day09_If_And_Else_Statement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 100;

        if (score>=90 && score<=100) {
            System.out.println("Your grade is A");
        }
        else if (score>= 80 ) {
            System.out.println("Your grade is B");
        }
        else if (score >= 70) {
            System.out.println("Your grade is C");
        }
        else if (score >=60) {
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("You failed");
        }


    }

}
