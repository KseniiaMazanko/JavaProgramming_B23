package day10_If_Statements;

public class NameOfMonths {

    public static void main(String[] args) {

        int number = 13;
        String name = "";

        if (number>=1 && number <=12) {

            if(number == 1) {
                name = "January";
            }
            else if(number == 2) {
                name = "February";
            }
            else if(number == 3) {
                name = "March";
            }
            else if(number == 4) {
                name = "April";
            }
            else if(number == 5) {
                name = "May";
            }
            else if(number == 6) {
                name = "June";
            }
            else if(number == 7) {
                name = "July";
            }
            else if(number == 8) {
                name = "August";
            }
            else if(number == 9) {
                name = "September";
            }
            else if(number == 10) {
                name = "October";
            }
            else if(number == 11) {
                name = "November";
            }
            else {
                name = "December";
            }

        }
        else {
            name = "Invalid number, should be from 1 to 12";
        }
        System.out.println("The name of the month entered is " + name);

    }

}
