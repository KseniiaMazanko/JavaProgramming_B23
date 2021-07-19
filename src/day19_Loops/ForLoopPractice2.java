package day19_Loops;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        //A-Z ascii table

        for(int i=65; i<=90; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();

        System.out.println("___________________________");

        for (char i = 'A'; i<= 'Z'; i++){
            System.out.print(i+ " ");


        }
        System.out.println();

        for (char i = 'Z'; i >='A'; i-- ){
            System.out.print(i + " ");
        }
        System.out.println();


        //print the chars from 1000 to 30 000 in the same line separated by space
       /* for (char i = 1000; i <= 30_000; i++) {
            System.out.print(i + " ");
        }*/



    }

}
