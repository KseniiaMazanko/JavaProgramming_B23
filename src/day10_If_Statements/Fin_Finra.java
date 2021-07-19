package day10_If_Statements;

public class Fin_Finra {

    /*
    Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3 output: FIN
                number = 10 output: RA
                number = 15 output:  FINRA
     */
    public static void main(String[] args) {
        int number = 7;
        String result = "";
        if (number%3==0 && number%5==0){
            result = "FINRA";
        }
        else if (number%5==0) {
            result = "RA";
        }
        else if (number%3==0){
            result = "FIN";
        }
        else {
            result = ""+number; //converts to string
        }

        System.out.println("result = " + result);

    }

}
