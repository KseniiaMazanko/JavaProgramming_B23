package day21_WhileAndDoWhile;

public class WhileLoopPractice {

    public static void main(String[] args) {


        String sentence = "Java Java Java Java";
        int countJava = 0;//1

        //String originalSentence = sentence; //to keep the original sentence



        while(sentence.contains("Java")){ //to check the case sensitivity add toLowerCase first
            //sentence.toLowerCase().contains("java")
            countJava++;
            sentence = sentence.replaceFirst("Java", "");//once the count is
            // increased we are taking out the first java,
            // and checking if the sentence still contains java,
            // then the process repeats until thee is no more JAva
        }

        System.out.println("countJava = " + countJava);


    }


}
