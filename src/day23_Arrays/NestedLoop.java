package day23_Arrays;

public class NestedLoop {

    public static void main(String[] args) {







        System.out.println("____________________");

        for(int j = 1 ; j <= 5; j++){ //outter loop
            //for(int j=6; j <=10; j++){ //as long as it repeats 5 times line 15 and line 16 afe the same
            for(int i = 1 ; i <= 5; i++){ //inner loop
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }



}
