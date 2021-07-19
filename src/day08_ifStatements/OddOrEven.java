package day08_ifStatements;

public class OddOrEven {


    public static void main(String[] args) {

        int number = 100;
        boolean odd = number%2 !=0;


        if(odd) {
            System.out.println(number + " is odd");
        }

        if(!odd) {
            System.out.println(number + " is even");
        }

    }


}
