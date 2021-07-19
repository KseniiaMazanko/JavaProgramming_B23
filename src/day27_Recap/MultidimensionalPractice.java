package day27_Recap;

import java.util.Arrays;

public class MultidimensionalPractice {

    public static void main(String[] args) {


        String[] scrum1 = {"Anna", "Yulia"};
        //                  0           1
        String[] scrum2 = {"Sabir", "Tamara"};
        //                  0           1
        String[] scrum3 = {"Tugba", "Hilal"};
        //                  0           1
        String [][] scrumTeams = {scrum1, scrum2, scrum3};//length 3
        //                          0       1       2

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(Arrays.toString(scrumTeams[0]));

        System.out.println(scrumTeams[1][1]);


        for (String[] eachTeam : scrumTeams) {
            for (String eachMember : eachTeam){
                System.out.println(eachMember);
            }
        }

        System.out.println("_________________");
        int [] numbers = {1,2,3,4,5};
        int temp = numbers[1];
        numbers[1] = numbers[3];

        numbers[3] = temp;

        System.out.println(Arrays.toString(numbers));




    }
}
