package day34_LocalDateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {


        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(DF));


        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");//a means 12 hours format
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);//current time
        System.out.println(currentTime.format(TF));//formatted time

        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1);

        System.out.println(time1.format(TF));






    }
    //MM/dd/YYYY or YY  EEEE is the name of the day



}
