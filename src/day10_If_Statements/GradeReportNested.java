package day10_If_Statements;

public class GradeReportNested {

    public static void main(String[] args) {

        int score = 80;
        String grade = "";

        if (score >=0 && score<=100)
        {
            if (score >= 90) {
                grade =  "A";
            } else if (score >= 80) {
                grade =  "B";
            } else if (score >= 70) {
                grade =  "C";
            } else if (score >= 60) {
                grade =  "D";
            } else {
                grade =  "F";
            }
        }
        else {
            grade =  "The score is invalid";
        }

        System.out.println(grade);

    }



}
