package day09_If_And_Else_Statement;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {

        /*
 write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2
            output:
                    28 days
        Hints: you will need single if statements for:
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
         */

//        if(number ==2) {
//            System.out.println("28 days");
//        }
//        if(number ==4 || number ==6 || number == 9 || number == 11) {
//            System.out.println("30 days");
//        }
//        if (number == 1 || number == 3 || number == 5 || number == 7 ||number == 8 ||number ==10 || number==12) {
//            System.out.println("31 days");
//        }


        // leaner code!:

        int number = 5;
        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days) {
            System.out.println("28 Days");
        }
        if (has30Days) {
            System.out.println("30 Days");
        }
        if (has31Days) {
            System.out.println("31 Days");
        }

    }

}
