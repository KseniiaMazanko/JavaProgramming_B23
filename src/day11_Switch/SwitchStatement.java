package day11_Switch;

public class SwitchStatement {
    public static void main(String[] args) {

        int number = 3;
        String result = "";
        switch (number){

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";
                break;
        }

        System.out.println(result);

    }

}
