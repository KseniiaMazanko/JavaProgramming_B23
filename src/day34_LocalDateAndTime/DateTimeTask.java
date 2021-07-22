package day34_LocalDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTask {

    /*use the LocalDate & Time get the date and time in the following format:
    Tuesday, 1:00 pm, Nov/24/2020
     */

    public static void main(String[] args) {


        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a");

        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);

        System.out.println(a.format(DTF));

        LocalDateTime time2 = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time2);
        DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");
        System.out.println(time2.format(DTF2));

        //what day is 2022-01-01
        String result = LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result " + result);


//using a created custom method
        String day = nameOfTheDay(1991, 10, 3);
        System.out.println(day);


    }

    public static String nameOfTheDay(int year, int month, int day){
        String result = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }


}
