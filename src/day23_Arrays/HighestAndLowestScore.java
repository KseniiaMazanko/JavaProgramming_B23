package day23_Arrays;

public class HighestAndLowestScore {

    public static void main(String[] args) {

        int [] scores = {85, 70, 95, 90, 100};
        String [] names = {"Mike", "Adam", "Tony", "John", "Ammy"};

        int highestScore = scores[0];
        String maxName = "";

        int minScore = scores[0];
        String minName = "";


            for(int i=0; i<=scores.length-1; i++){
                if(scores[i]>highestScore){
                    highestScore=scores[i];
                    maxName = names[i];
                }

                if(scores[i]<minScore){
                    minScore=scores[i];
                    minName=names[i];
                }

        }

        System.out.println("minName = " + minName);
        System.out.println("minScore = " + minScore);
        System.out.println("maxName = " + maxName);
        System.out.println("highestScore = " + highestScore);



    }

}
