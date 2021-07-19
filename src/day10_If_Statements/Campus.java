package day10_If_Statements;

public class Campus {

    /*Campus time: User enters a time(hour in 24 hour format) and will be able
    to find out if the campus is open or not.
    Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open
    time they should see message: “open”
    but if the time entered is outside of operating hours they should see: “ closed”*/

    public static void main(String[] args) {

        int hour = -9;
        String result = "";

        if (hour >0 && hour <=24) {
            if (hour >= 8 && hour<= 23) {
                result = "Open";
            }
            else {
                result = "Closed";
            }
        }
        else {
            result = "Invalid time, the time should be 1 to 24";
        }

        System.out.println(result);



    }


}
