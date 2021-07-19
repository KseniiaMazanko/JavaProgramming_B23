package day20_BranchingStatements;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "I love books, I purchased a lot of books";
        String word = "book";
        int count = 0;

        for(int i=0; i<=sentence.length()-word.length(); i++){
            String each = sentence.substring(i,i+word.length());
            if(each.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);


    }

}
