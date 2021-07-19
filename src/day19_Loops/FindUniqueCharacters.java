package day19_Loops;

public class FindUniqueCharacters {

    public static void main(String[] args) {

        String word = "aajbbcc";
        String result = "";
        


       for(int i =0; i<=word.length()-1; i++){

           char ch = word.charAt(i);

           boolean isUnique = word.indexOf(ch) == word.lastIndexOf(ch);
           //if the first index number and the last index numbers of the character is the same then the char is unique

           if(isUnique) {
               result += ch;
           }
            
        }

        System.out.println("result = " + result);


    }

}
