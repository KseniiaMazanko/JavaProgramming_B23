package day19_Loops;

public class LoopPractice {

    public static void main(String[] args) {


        for(int i=0; i<=1000; i++) {
            System.out.print(i+" ");//to print in the same line
        }

        System.out.println();
        System.out.println("Hello");


        System.out.println("_________________________");

        //printing odd numbers

        for(int i=1; i<=100; i++){//1,2,3,4,5....100
           if(i%2!=0){
               System.out.print(i + " ");
           }
        }

        System.out.println();//to make sure it starts from new line


        //option 2
        System.out.println("____________________________");

        for(int i=1; i<=100; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("______________________");

        for (int i = 1; i < 101 ; i++) {

            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("_________________________");

        String odds = "";
        String evens = "";

        for(int i=1; i<101; i++){
            if(i%2==0){
                odds+=i+" ";
            }
            else{
                evens += i+ " ";
            }
        }

        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);







    }

}
