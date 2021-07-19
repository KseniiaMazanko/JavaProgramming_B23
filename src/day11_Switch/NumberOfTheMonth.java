package day11_Switch;

public class NumberOfTheMonth {

    public static void main(String[] args) {


        int number = 9;
        String name = "";

        if(number>=1 && number <=12){

            name = (number==1)? "Jan" :(number==2)? "Feb" :(number == 3)? "March" :(number == 4)? "April" :(number == 5)? "May" :(number ==6)? "Jun" :(number == 7)?
                    "July" :(number==8)? "Aug" :(number==9)? "September" :(number == 10)? "Oct" :(number==11)? "Nov" : "Dec";
        }
        else {
            name = "invalid";
        }

        System.out.println(name);

    }




}
