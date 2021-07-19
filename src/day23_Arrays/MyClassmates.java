package day23_Arrays;

public class MyClassmates {


    public static void main(String[] args) {

        String [] friends = {"Sabir", "Ahmet", "Tugba", "Beryl"};
        System.out.println("SIze: " + friends.length);

        for(int i=0; i<= friends.length-1; i++){
            System.out.println(friends[i]);
        }

        //if we dont know what are the elements are but we do know how many elements will be stored
        String [] friends2 = new String[5];
        System.out.println("Size: " + friends2.length);

        System.out.println("_________________________");

        friends2[0]  = "Kemal";
        friends2[1] = "Muhtar";
        friends2[2] = "Komiljon";
        friends2[3] = "Ahmed";
        friends2[4] = "Asia";

        for (int i = 0; i <= friends2.length-1 ; i++) {
            System.out.println(friends2[i]);
        }

    }





}
