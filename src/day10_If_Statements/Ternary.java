package day10_If_Statements;

public class Ternary {

    public static void main(String[] args) {

        int number = 100;
        String result = "";

        if(number%2==0) {
            result = "Even";
        }
        else {
            result = "Odd";
        }

        System.out.println(result);

        String result2 = (number%2==0)? "Even" : "Odd" ;
        System.out.println(result2);



    }

}
