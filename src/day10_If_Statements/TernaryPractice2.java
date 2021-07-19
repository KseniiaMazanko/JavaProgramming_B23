package day10_If_Statements;

public class TernaryPractice2 {

    public static void main(String[] args) {

        //posNegZero

        int num = 0;

        String result3 = (num >0 ) ? "Positive" :(num<0)? "Negative" : "Zero";

        System.out.println(result3);


        System.out.println("________________________________");

        int score = 55;

        char grade = (score>=90)? 'A' :(score>=80)? 'B' :(score >=70)? 'C'
                :(score>=60)? 'D' : 'F';

        System.out.println(grade);

        System.out.println("___________________________________");

        //days of the week
        int number = 7;

                String name = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number ==4)? "Thursday" :(number == 5)? "Friday"
                        :(number==6)? "Saturday" : "Sunday";

        System.out.println(name);


    }
}
