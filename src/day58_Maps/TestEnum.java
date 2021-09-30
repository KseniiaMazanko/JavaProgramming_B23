package day58_Maps;

public class TestEnum {


    public static void main(String[] args) {

        Browser browser=Browser.chrome;

        switch (browser){

            case firefox:
                System.out.println("Firefox is selected");
                break;

            case edge:
                System.out.println("Edge is selected");
                break;

            case safari:
                System.out.println("Safari is selected");
                break;

            case opera:
                System.out.println("Opera is selected");
                break;

            default:
                System.out.println("Chrome is selected");

        }

        System.out.println("_______________________________");


        //we could only assign whatever we put in the Enum
        Level level1 = Level.High;
        Level level2 = Level.Low;
        Level level3 = Level.Medium;

        System.out.println("________________________________");

        Month month = Month.August;
/*
        switch (month){
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                System.out.println("31 days");
            case September:
            case April:
            case June:
            case November:
                System.out.println("30 days");
            case February:
                System.out.println("28 days");

 */

        System.out.println("______________________________");

        String color1 = "Pink";
        Color color2 = Color.red;


        }






    }






