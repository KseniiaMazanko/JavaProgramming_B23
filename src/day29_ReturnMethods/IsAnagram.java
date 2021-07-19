package day29_ReturnMethods;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String str1 = "cinema";
        String str2 = "iceman";

        boolean isAnagram = isAnagram(str1,str2);
        System.out.println(isAnagram);

    }
    public static boolean isAnagram(String str1, String str2){

        boolean isAnagram = true;

        if(str1.length()!=str2.length()){
            return false;
        }

        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
                    isAnagram=true;
                }
                else{
                    isAnagram=false;
                }
        return isAnagram;
    }


}
