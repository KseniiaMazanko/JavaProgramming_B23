package day19_Loops;

public class PrintTheShape {

    public static void main(String[] args) {

        /*
        print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */

        for(int i=1; i<=8; i++){
            System.out.println("* * * * * *");
        }

/*
print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
 */

        System.out.println("* * * * * *");
        for(int i=1; i<=8; i++){
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");


        System.out.println("_______________________________");






    }


}
