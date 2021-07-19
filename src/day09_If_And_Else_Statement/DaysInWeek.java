package day09_If_And_Else_Statement;

public class DaysInWeek {

    public static void main(String[] args) {

        /*
        1. write program that can print out the name of the day based on the number 1 ~ 7
         */
        int number = 3;

        if (number == 1) {
            System.out.println("Monday");
        }
        else if (number == 2) {
            System.out.println("Tuesday");
        }
        else if (number == 3) {
            System.out.println("Wednesday");
        }
        else if (number == 4) {
            System.out.println("Thursday");
        }
        else if (number == 5) {
            System.out.println("Friday");
        }
        else if (number == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }


    }

}
