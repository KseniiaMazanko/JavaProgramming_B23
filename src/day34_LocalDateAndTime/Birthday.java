package day34_LocalDateAndTime;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {


        birthday(1994, 7, 22);


    }

    public static void birthday (int year, int month, int day){

        LocalDate DOB = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        if(DOB.getMonthValue() == today.getMonthValue()  &&
                DOB.getDayOfMonth() == today.getDayOfMonth() ){
            System.out.println("Happy birthday, you are " +
                    (today.getYear() - DOB.getYear()) + " today");
        }
        else{
            System.out.println("Today is not your birthday");
        }

    }

}
