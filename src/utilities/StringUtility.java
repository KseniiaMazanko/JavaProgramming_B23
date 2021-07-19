package utilities;

import java.util.Arrays;

public class StringUtility {

    //reverses any given string, and returns it
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){ // "Java"
        String reversedStr =  reverse(str);  //"avaJ"
        return  str.equalsIgnoreCase(reversedStr);
    }

    // isAnagram
    public static boolean isAnagram (String str1, String str2){


        String [] str1Array = str1.split("");
        Arrays.sort(str1Array);

        String [] str2Array = str2.split("");
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array,str2Array);

    }

    /* create a method that can remove duplicates from string, returns string
    removeDup("AAABBBBBBCCCCCCC") ===> "ABC"*/
    public static String removeDuplicates (String str){

        String result = "";

            /*for(int i=0; i<str.length(); i++){

                if(!result.contains("" + str.charAt(i))){
                    result+=str.charAt(i);
                }

            }*/
        for (char ch: str.toCharArray()){ //create the array of chars from the entered string

            if(result.indexOf(ch) < 0){ //if the index is negative it means that the result
                // does not contain the char
                result+=ch;
            }
        }

        return result;
    }


    //returns the frequency of ch from the string
    public static int frequency (String str, char ch){

        int count = 0;

        for (char each: str.toCharArray()){//each represents each character of string

            if(each==ch){
                count++;
            }

        }

        return count;


    }


    //unique characters
    public static String uniqueChars(String str){

        String unique = "";

        for(int i=0; i<str.length(); i++){
            char each = str.charAt(i);
            int frequency = frequency(str, each);
            if(frequency==1){
                unique+=each;
            }
        }
        return unique;

    }


    //frequency of chars  //String s3 = "AAABBC";//A3B2C1
    public static String frequencyOfChars(String str){

        String result = "";
        for (char each : removeDuplicates(str).toCharArray()) {//each A,B,C
            result+=""+each+frequency(str, each);
        }
        return result;
    }


    //frequency of the word from the sentence
    public static int frequencyOfWord(String sentence,String word) {
        int count = 0;//3

        sentence=sentence.toLowerCase();
        word = word.toLowerCase();

        while(sentence.contains(word)){
            sentence=sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }








}
