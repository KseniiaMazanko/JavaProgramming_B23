package day31_MethodsRecap;

import utilities.StringUtility;

import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        String test = "AAAAAABBBBBIIIIIIDllllrsssse";
        System.out.println(removeDuplicates(test));

        System.out.println("_________________________");


        String isAnagram1 = "cinema";
        String isAnagram2 = "iceman";
        System.out.println(isAnagram(isAnagram1, isAnagram2));

        System.out.println("_________________________");

        String word = "MMMMMMMMMMMMMMMMNNNNNNNNNNAAAAA";
        int f = StringUtility.frequency(word, 'M');
        System.out.println(f);
        //System.out.println(frequency(word, 'M'));

        System.out.println("________________________");

        String s = "aaaobjcccccdddddeeeeef";
        String result = uniqueChars(s);
        System.out.println(result);


        System.out.println("-------------------------");
        String s3 = "AAABBCNNNNNNNNNRRRRRRRRPPPPPPPPP";//A3B2C1N9R8P9
        String result2 = frequencyOfChars(s3);
        System.out.println(result2);

        System.out.println("_________________________");

    }

    //create a method that can remove duplicates from string, returns the string

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


    //isAnagram

    public static boolean isAnagram (String str1, String str2){


        String [] str1Array = str1.split("");
        Arrays.sort(str1Array);

        String [] str2Array = str2.split("");
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array,str2Array);

    }

    /*
    Write a return method named frequency that accepts two parameters: String and Char. then returns the frequency of the char from the string
            Ex:
                frequency("AAABB", 'A');  ==> 3
     */

    public static int frequency (String str, char ch){

        int count = 0;

        for (char each: str.toCharArray()){//each represents each character of string

            if(each==ch){
                count++;
            }

        }

        return count;


    }


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
    public static String frequencyOfChars (String str){

            String result = "";
            for (char each : removeDuplicates(str).toCharArray()) {//each A,B,C
                result+=""+each+frequency(str, each);
            }
            return result;
        }




}
