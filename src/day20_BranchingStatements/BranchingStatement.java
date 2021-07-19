package day20_BranchingStatements;

public class BranchingStatement {

    public static void main(String[] args) {

        for(int i =0; i<=5; i++){

            if(i==3){ //3 is not included
                break;
            }
            System.out.println(i);
        }

        System.out.println("_______________");

        for(int i=0; i<=5; i++) {
            if (i == 3) {
                continue;//skip
            }


            System.out.println(i);
        }


        System.out.println("___________________");

        //print the odd numbers between 1-10, must use continue


        for(int i=0; i<11; i++){

            if(i%2==0){//if i is even number
                continue;//skip
            }

            System.out.println(i);
        }


        System.out.println("______________________");

        //print all the numbers1-100 that evenly divisible by 3 and 5

        for(int i = 0; i<=100; i++){

            if(i%15!=0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("_______________________________");

        //print all the letters between A-Z except for D,T,X

        for(char i='A'; i<='Z'; i++){
            if(i == 'D' || i=='T' || i=='X'){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();



    }


}
