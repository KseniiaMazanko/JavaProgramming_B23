package day20_BranchingStatements;

public class FrequencyOfWord4 {

    public static void main(String[] args) {

        /*
        write a program to print true if the string "cat" and "dog"
        appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
         */

        String sentence = "cat dog cat dog dog dog";
        String word1 = "cat";
        String word2 = "dog";
        int dogCount = 0;
        int catCount = 0;


        for(int i=0; i<=sentence.length()- word1.length(); i++){
            String each = sentence.substring(i, i+word1.length());
            if(each.equalsIgnoreCase(word1)){
                catCount++;
            }
            else if (each.equalsIgnoreCase(word2)){
                dogCount++;
            }
        }

        System.out.println("catCount = " + catCount);
        System.out.println("dogCount = " + dogCount);



    }


}
