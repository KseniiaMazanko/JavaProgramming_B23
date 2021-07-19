package day31_MethodsRecap;

import utilities.StringUtility;

import java.util.Arrays;
import java.util.Locale;

public class WarmupTasks2 {

    public static void main(String[] args) {


        String sentence = "Java java JaVa";
        String word = "java";

        String sentence2 = "Cybertek cybertek CYbErtek CYBERTEK";
        String word2 = "Cybertek";

        int result = frequencyOfWord(sentence2, word2);
        System.out.println(result);

        String str = "Racecar";
        boolean isPalindrome = StringUtility.isPalindrome(str);
        System.out.println(isPalindrome);

        String str2 = "CCCYYYBBBBEEERRRRRTTTTEEEEEK";
        String noDuplicates = StringUtility.removeDuplicates(str2);
        System.out.println(noDuplicates);



    /*
    write a return method named addElement that can add an Integer
    after the  last index of an integer array
     */

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        int[] copy = Arrays.copyOf(array, array.length + 1);
        copy[array.length] = element;

        System.out.println(Arrays.toString(copy));



        int[] array1 = {1, 2, 3, 4, 5, 8};
        int[] array2 = {4, 8, 10, 20};
        int [] array3 = mergeTwoArrays(array1, array2);
        System.out.println(Arrays.toString(array3));

    }

    /*
    create a return method named contains that accepts one interger array and one integer,
    returns true if the integer is contained in the array, otherwise returns false
			Ex: array = {1,2,3,4,5}
				num = 5;

				contains(array, num) ==> true
     */




    //create a return method named merge that can merger two arrays of integers
    public static int[] mergeTwoArrays (int [] arr1, int[] arr2){
            int [] resultArr = new int [arr1.length+arr2.length];

            int j=0;
            for(int i=0; i<arr1.length; i++){
                resultArr[j++] = arr1[i];
            }
            for(int i=0; i<arr2.length; i++){
                resultArr[j++] = arr2[i];
            }

            return resultArr;

        }


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
