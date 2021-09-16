package day50_Exceptions;

public class MorningWorkout {

    /*
    MorningWorkOut:
        1. Do 30 push-ups
                try pausing 2.5 seconds in each

        2. Do 20 Pull-ups
                try pausing 3.5 seconds in each
     */


    public static void main(String[] args) //throws InterruptedException temporary solution
    {

        for(int i=1; i<=30; i++){
            System.out.println("Push up " + i);
            pause(2.5);
        }

        for(int i=1; i<=20; i++){
            System.out.println("Pull up " + i);
            pause(3.5);
        }


    }
    public static void pause (double seconds) {

        try {
            Thread.sleep((long) seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }








}
