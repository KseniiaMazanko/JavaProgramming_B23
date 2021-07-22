package day34_LocalDateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime breakTime = now.plusMinutes(15);
        System.out.println(breakTime);

        LocalTime quizIsDue = breakTime.plusMinutes(20);
        System.out.println(quizIsDue);



    }

}
