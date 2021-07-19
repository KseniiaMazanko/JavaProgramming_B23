package day10_If_Statements;

public class GradesNested {

    public static void main(String[] args) {

            int grade = 70;
        String result = "";
        if (grade>=0 && grade<=100) {
            if (grade>=90) {
                result = "excellent";
            }
            else if (grade >= 70) {
                result = "good";
            }
            else if (grade >=60) {
                result = "pass";
            }
            else {
                result = "fail";
            }

        }
        else {
            result = "invalid entry, should be a number 1 to 100";
        }



    }
}


